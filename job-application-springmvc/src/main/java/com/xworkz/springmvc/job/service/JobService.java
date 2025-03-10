package com.xworkz.springmvc.job.service;

import com.xworkz.springmvc.job.dto.JobDto;

import java.util.List;

public interface JobService {


    boolean validAndSaveJob(JobDto jobDto);

    List<JobDto> getAllUsers();

    String updateUser(JobDto jobDto);

    JobDto fetchJobById(int id);

    void deleteUserById(int id);
}
