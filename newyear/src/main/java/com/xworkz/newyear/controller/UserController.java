package com.xworkz.newyear.controller;

import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.entity.UserEntity;
import com.xworkz.newyear.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public String onSave(@Valid UserDto dto, BindingResult bindingResult, Model model) {
        boolean hasErrors = bindingResult.hasErrors();
        System.out.println(hasErrors);
        log.info("in On save method");
        if (hasErrors) {
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(error -> {
                FieldError fieldError = (FieldError) error;
                System.out.println(fieldError.getField() + "  Error Message ::   " + fieldError.getDefaultMessage());
                if (fieldError.getField().equalsIgnoreCase("firstName")) {
                    model.addAttribute("firstNameError", fieldError.getDefaultMessage());
                }
            });

        }
        if (userService.saveAndValidate(dto)) {
            model.addAttribute("firstname", dto.getFirstName());
            boolean isEmailSame = userService.saveAndValidate(dto);
            if (isEmailSame == true) {
                return "response";
            }
            return "response";
        } else
            model.addAttribute("error", "Try another email");
        return "signUp";


    }


    @PostMapping("signInAction")
    public String checkEmailAndPassword(String email, String password, Model model) {
        System.out.println("in controller");
     UserDto userDto = userService.getEntityByEmailId(email);
        System.out.println(userDto);
        if (password.equals(userDto.getPassword())) {
            model.addAttribute("updateKey",userDto);
            model.addAttribute("firstName",userDto.getFirstName());
            return "dashboard";
        } else {
            model.addAttribute("NotFound", "invalidCredentials");
            model.addAttribute("email", email);
            return "signIn";
        }
    }

    @PostMapping("dashboard")
    public String dashboard(Model model) {

        return "dashboard";
    }

    @PostMapping("reset-password")
    public String changePasword(String email, String newPassword, String confirmPassword, Model model) {
        if (email != null) {
            boolean isUpdated = userService.updatePasswordByEmail(email, newPassword, confirmPassword);

            if (isUpdated) {
                model.addAttribute("success", "Password updated successfully");

            } else {
                model.addAttribute("Invalid", "Invalid email");
            }
        }
        return "forgotPassword";
    }

    @GetMapping("fetch/{email}")
    public String getUpdatePage(@PathVariable String email, HttpSession session,Model model) {

        UserDto dto = userService.getEntityByEmailId(email);
        session.setAttribute("sessionAttribute",dto);
        log.info("data is{}",dto);
        model.addAttribute("updateKey", dto);
        System.out.println("IN GET UPDATE -PAGE"+dto);
        log.info("{}",dto);
        return"update";
    }

    @GetMapping("update")
    public String getUpdate(){
        return "update";
    }

    @PostMapping("fetch/update")
    public String updateProfile(UserDto userDto, HttpServletRequest httpServletRequest, Model model, @RequestParam("file")MultipartFile multipartFile){
        log.info(" in update profile{}",userDto);

        UserDto sessionDto= (UserDto) httpServletRequest.getSession().getAttribute("sessionAttribute");

        UserDto userDto1=userService.updateProfile(userDto,sessionDto,multipartFile);

        model.addAttribute("updateKey",userDto1);
        model.addAttribute("success","Updated Successfully");
        return "update";
    }
}
