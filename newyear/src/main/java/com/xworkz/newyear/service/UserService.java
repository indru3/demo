package com.xworkz.newyear.service;

import com.xworkz.newyear.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;


public interface UserService {
    boolean saveAndValidate(UserDto dto);


    UserDto getEntityByEmailId(String email);

    boolean updatePasswordByEmail(String email,String newPassword,String confirmPassword);
    UserDto updateProfile(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile);

}
