package com.xworkz.springmvc.passport.service;

import com.xworkz.springmvc.passport.dto.PassportDto;
import com.xworkz.springmvc.passport.repository_or_dao.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PassportServiceImpl implements PassportService{

    @Autowired
    PassportRepository passportRepository;

    @Override
    public boolean validateAndSave(PassportDto passportDto) {
        boolean isValidateFirstName = false;

        if (passportDto != null){
            if (passportDto.getFirstName()!=null && !passportDto.getFirstName().isEmpty());
            isValidateFirstName = true;
            passportRepository.add(passportDto);
            System.out.println("FirstName is validated");

        }

        return isValidateFirstName;
    }

    @Override
    public List<PassportDto> getAllUsers() {

      return passportRepository.getAllUsers();
    }

    @Override
    public PassportDto fetchUserById(int id) {

        if (id > 0 ){
         return  passportRepository.fetchUserById(id);
        }
        return null;
    }

    @Override
    public String updateUser(PassportDto passportDto) {
        if (passportDto!=null){
            if (passportDto.getFirstName()!=null && !passportDto.getFirstName().isEmpty()){
                passportRepository.updateUser(passportDto);
                return "update passport successfully";
            }
        }
        return "failed to update successfully";
    }

    @Override
    public void deleteUserById(int id) {
        if (id > 0 ){
            passportRepository.deleteUserById(id);
        }
    }

}
















 /*boolean isValidateLastName = false;
        boolean isValidateId= false;*/
 /*  if (passportDto.getLastName()!=null && !passportDto.getLastName().isEmpty()){
            System.out.println("LastName is validated");
            isValidateLastName = true;
        }

        if (passportDto.getId() > 0){
            System.out.println("Id is validated ");
            isValidateId = true;
        }

        if (isValidateFirstName == true && isValidateLastName == true && isValidateId == true){
            System.out.println("PassportDto is validated successfully");
            passportRepository.add(passportDto);
        }*/