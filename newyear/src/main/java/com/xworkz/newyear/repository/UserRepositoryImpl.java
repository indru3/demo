package com.xworkz.newyear.repository;

import com.xworkz.newyear.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public boolean saveAndValidateUser(UserEntity entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public UserEntity getEntityByEmail(String email) {
      /*  System.out.println("IN repo");
       UserEntity champ =(UserEntity) entityManagerFactory.createEntityManager().createNamedQuery("getEntityByEmail")
                .setParameter("Email", emailId)
                .getSingleResult();
        System.out.println(champ);

    return champ;*/
        List<UserEntity> result = entityManagerFactory.createEntityManager()
                .createNamedQuery("getEntityByEmail")
                .setParameter("Email", email)
                .getResultList();
        if (result.isEmpty()) {
            return new UserEntity();  // or handle accordingly
        }
        return result.get(0);  // or return the first result

    }

    @Override
    public boolean updatePasswordByEmail(String email, String newPassword, String confirmPassword) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("updatePasswordByEmail");
        query.setParameter("password", newPassword);
        query.setParameter("confirmPassword",confirmPassword);
        query.setParameter("email", email);
        entityManager.getTransaction().begin();
        int updatedRows = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        return updatedRows > 0;
    }

    @Override
    public UserEntity updateProfile(UserEntity userEntity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
       UserEntity updatedDetails = entityManager.merge(userEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return updatedDetails;
    }


}
