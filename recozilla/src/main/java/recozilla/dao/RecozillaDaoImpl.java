package recozilla.dao;



import recozilla.dto.RecozillaDto;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

     // This is done using JPA //
public class RecozillaDaoImpl implements RecozillaDao{
    @Override
    public boolean addAccount(RecozillaDto recozillaDto) {
      EntityManager entityManager =  EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
      entityManager.getTransaction().begin();
      entityManager.persist(recozillaDto);   // persist  =  save  in Hibernate //
      entityManager.getTransaction().commit();
      entityManager.close();
      return true;
    }

    @Override
    public List<RecozillaDto> getAllAccounts() {
     EntityManager entityManager =    EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
    Query query =  entityManager.createQuery("from RecozillaDto recozillaDto");
     List<RecozillaDto> dtos = query.getResultList();
     entityManager.close();
        return dtos;
    }

    @Override
    public RecozillaDto getAccountById(int id) {
        EntityManager entityManager =  EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        RecozillaDto recozillaDto =entityManager.find(RecozillaDto.class,id);
        entityManager.close();
        return recozillaDto;
    }

    @Override
    public RecozillaDto getAccountsByName(String firstName) {
        EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
        Query query = entityManager.createQuery("select user from RecozillaDto user where user.firstName=: firstName");
        query.setParameter("firstName",firstName);
        RecozillaDto recozillaDto = (RecozillaDto) query.getSingleResult();
        entityManager.close();
        return recozillaDto;
    }

    @Override
    public boolean deleteUserById(int id) {
       EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
       entityManager.getTransaction().begin();
       Query query = entityManager.createQuery("delete from RecozillaDto when id=: id");
       query.setParameter("id",id);
       int noOfRowsDeleted = query.executeUpdate();
       entityManager.getTransaction().commit();
       entityManager.close();
        return noOfRowsDeleted > 0;
    }

    @Override
    public boolean updateAccountDetails(RecozillaDto recozillaDto) {
       EntityManager entityManager = EntityManagerFactoryUtil.getEntityManagerFactory().createEntityManager();
       entityManager.getTransaction().begin();
       Query query = entityManager.createQuery("update RecozillaDto p set p.firstName =: firstName where p.id=:id");
       query.setParameter("id",recozillaDto.getId());
       query.setParameter("firstName",recozillaDto.getFirstName());
       int updateAccountChangeInfo = query.executeUpdate();
        System.out.println("The changes are applied Successfully" + updateAccountChangeInfo);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
