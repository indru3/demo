package com.xworkz.springmvc.passport.repository_or_dao;

import com.xworkz.springmvc.passport.dto.PassportDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class PassportRepositoryImpl implements PassportRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean add(PassportDto passportDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(passportDto);
        entityManager.getTransaction().commit();
        entityManager.close();

        return false;
    }

    @Override
    public List<PassportDto> getAllUsers() {
        return (List<PassportDto>) entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public PassportDto fetchUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        PassportDto passportDto = entityManager.find(PassportDto.class, id);
        entityManager.close();
        return passportDto;
    }

    @Override
    public void updateUser(PassportDto passportDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("updateUser").
                setParameter("id", passportDto.getId()).
                setParameter("firstName", passportDto.getFirstName()).
                setParameter("lastName", passportDto.getLastName()).
                setParameter("phoneNumber", passportDto.getPhoneNumber()).
                setParameter("email", passportDto.getEmail()).
                setParameter("address", passportDto.getAddress()).
                setParameter("age", passportDto.getAge()).
                setParameter("country", passportDto.getCountry()).
                executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteUserById");
        query.setParameter("id",id);
       int noOfRowsDeleted =  query.executeUpdate();
       entityManager.getTransaction().commit();
       entityManager.close();

       if (noOfRowsDeleted > 0){
            return true;
       }
       return false;
    }
}
