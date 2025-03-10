package com.xworkz.springmvc.job.repository_or_dao;

import com.xworkz.springmvc.job.dto.JobDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;


@Repository
public class JobRepositoryImpl implements JobRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean add(JobDto jobDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(jobDto);
        entityManager.getTransaction().commit();
        entityManager.close();

        return false;
    }

    @Override
    public List<JobDto> getAllUsers() {
        return (List<JobDto>) entityManagerFactory.createEntityManager().createNamedQuery("getAllUsers").getResultList();
    }

    @Override
    public void updateUser(JobDto jobDto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("updateUser").
                setParameter("id", jobDto.getId()).
                setParameter("firstName", jobDto.getFirstName()).
                setParameter("lastName", jobDto.getLastName()).
                setParameter("phone", jobDto.getPhone()).
                setParameter("city", jobDto.getCity()).
                setParameter("email", jobDto.getEmail())
                .executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public JobDto fetchJobById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        JobDto jobDto = entityManager.find(JobDto.class, id);
        entityManager.close();
        return jobDto;
    }

    @Override
    public boolean deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("deleteUserById");
        query.setParameter("id", id);
        int noOfRowsDeleted = query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();

        if (noOfRowsDeleted > 0) {
            return true;
        }
        return false;
    }
}

