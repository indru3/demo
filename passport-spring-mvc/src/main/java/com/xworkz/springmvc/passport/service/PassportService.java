package com.xworkz.springmvc.passport.service;

import com.xworkz.springmvc.passport.dto.PassportDto;

import java.util.List;

public interface PassportService {

    boolean validateAndSave(PassportDto passportDto);

    List<PassportDto> getAllUsers();

    PassportDto fetchUserById(int id);


    String updateUser(PassportDto passportDto);

    void deleteUserById(int id);
}
