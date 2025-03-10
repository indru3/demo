package com.xworkz.springmvc.job.repository_or_dao;

import com.xworkz.springmvc.job.dto.JobDto;

import java.util.List;

public interface JobRepository {
    boolean add(JobDto jobDto);

    List<JobDto> getAllUsers();

    void updateUser(JobDto jobDto);

    JobDto fetchJobById(int id);

    boolean deleteUserById(int id);
}
