package com.xworkz.springmvc.passport.repository_or_dao;

import com.xworkz.springmvc.passport.dto.PassportDto;

import java.util.List;

public interface PassportRepository {
    boolean add(PassportDto passportDto);

    List<PassportDto> getAllUsers();

    PassportDto fetchUserById(int id);

    void updateUser(PassportDto passportDto);

    boolean deleteUserById(int id);
}
