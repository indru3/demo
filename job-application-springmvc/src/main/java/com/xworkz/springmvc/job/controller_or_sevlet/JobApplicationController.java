package com.xworkz.springmvc.job.controller_or_sevlet;

import com.xworkz.springmvc.job.dto.JobDto;
import com.xworkz.springmvc.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.sql.Struct;
import java.util.List;

@Component
@RequestMapping("/")
public class JobApplicationController {

    @Autowired
    JobService jobService;

    @PostMapping("jobDetails")
    public String addJob(JobDto jobDto,Model model){
        jobService.validAndSaveJob(jobDto);
        model.addAttribute("name",jobDto.getFirstName());
        return "response.jsp";
    }

    @GetMapping("getAllUsers")
    public String getAllUsers(Model model){
      List<JobDto> jobDtoList =  jobService.getAllUsers();
        model.addAttribute("ListOfJobs",jobDtoList);
        return "getAllUsers.jsp";
    }

    @PostMapping("updateUser")
    public String updateUser(JobDto jobDto, Model model){
        jobService.updateUser(jobDto);
        model.addAttribute("updated",jobDto);
        return "updateSuccess.jsp";
    }

    @GetMapping("fetchJob")
    public String fetchJobById(int id,Model model){
      JobDto jobs =  jobService.fetchJobById(id);
        model.addAttribute("update",jobs);
        return "updateUser.jsp";
    }

    @GetMapping("deleteJob")
    public String deleteUserById(int id,Model model){
        jobService.deleteUserById(Integer.parseInt(String.valueOf(id)));
        model.addAttribute("delete",id);
        return "getAllUsers";
    }

}
