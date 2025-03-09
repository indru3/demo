package com.xworkz.newyear.repository;

import com.xworkz.newyear.entity.UserEntity;

public interface UserRepository {
    boolean saveAndValidateUser(UserEntity entity);

    UserEntity getEntityByEmail(String email);

    boolean updatePasswordByEmail(String email,String newPassword,String confirmPassword);

    UserEntity updateProfile(UserEntity userEntity);
}
