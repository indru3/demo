package com.xworkz.springmvc.passport.controller_or_servlet;

import com.xworkz.springmvc.passport.dto.PassportDto;
import com.xworkz.springmvc.passport.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@RequestMapping("/")
public class PassportRegistrationController {

    @Autowired
    PassportService passportService;

    @PostMapping("passportDetails")
    public String addPassport(PassportDto passportDto, Model model){
        passportService.validateAndSave(passportDto);
        model.addAttribute("name",passportDto.getFirstName());

        return "response.jsp";

    }

    @GetMapping("getAllUsers")
    public String getAllUsers(Model model){
     List<PassportDto> passportDtoList =   passportService.getAllUsers();
     model.addAttribute("ListOfUsers", passportDtoList);
     return "getAllUsers.jsp";
    }

    @GetMapping("fetchUser")
    public String fetchUserById(int id, Model model){
      PassportDto passport =  passportService.fetchUserById(id);
        model.addAttribute("update",passport);
        return "updateUser.jsp";
    }

    @PostMapping("updateUser")
    public String updateUser(PassportDto passportDto,Model model){
        passportService.updateUser(passportDto);
        model.addAttribute("updated",passportDto);
        return "updateSuccess.jsp";
    }

    @GetMapping("delete")
    public String deleteUserById(int id,Model model){
        passportService.deleteUserById(Integer.parseInt(String.valueOf(id)));
        model.addAttribute("delete",id);
        return "getAllUsers";
    }

}
