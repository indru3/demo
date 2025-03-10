package com.xworkz.springmvc.job.service;

import com.xworkz.springmvc.job.dto.JobDto;
import com.xworkz.springmvc.job.repository_or_dao.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    JobRepository jobRepository;

    @Override
    public boolean validAndSaveJob(JobDto jobDto) {
        boolean isValidateName = false;
        if (jobDto!=null){
            if (jobDto.getFirstName()!=null && !jobDto.getFirstName().isEmpty()){
                jobRepository.add(jobDto);
                isValidateName = true;
                System.out.println("name is validated succesfully");
            }
        }
        return isValidateName;
    }

    @Override
    public List<JobDto> getAllUsers() {
      return   jobRepository.getAllUsers();
    }

    @Override
    public String  updateUser(JobDto jobDto) {
        if (jobDto!=null){
            if (jobDto.getFirstName()!=null && !jobDto.getFirstName().isEmpty()){
                jobRepository.updateUser(jobDto);
                return "job portal is updated";
            }
        }
        return "failed to update the job portal";
    }

    @Override
    public JobDto fetchJobById(int id) {
        if (id > 0){
          return  jobRepository.fetchJobById(id);
        }

        return null;
    }

    @Override
    public void deleteUserById(int id) {
        if (id > 0){
            jobRepository.deleteUserById(id);
        }
    }
}
