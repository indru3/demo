package com.xworkz.newyear.service;

import com.xworkz.newyear.constants.ServiceConstant;
import com.xworkz.newyear.dto.UserDto;
import com.xworkz.newyear.entity.UserEntity;
import com.xworkz.newyear.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

@Service
public class UserServiceImpl implements UserService{
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean saveAndValidate(UserDto dto) {
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(dto,userEntity);
        userEntity.setCreatedBy(dto.getEmail());
       userEntity.setCreatedDate(LocalDate.now());
    UserEntity entity=   userRepository.getEntityByEmail(dto.getEmail());
    if (entity==null){
        if (dto.getEmail()!=null){
            return userRepository.saveAndValidateUser(userEntity);
        }
        }
        return false;
    }

    @Override
    public UserDto getEntityByEmailId(String email) {
        System.out.println("In service");
        UserDto dto=new UserDto();
        UserEntity userEntity= userRepository.getEntityByEmail(email);
        BeanUtils.copyProperties(userEntity,dto);
        if (email!=null){
            return dto;
        }
       return new UserDto();
    }

    @Override
    public boolean updatePasswordByEmail(String email, String newPassword, String confirmPassword) {
   return userRepository.updatePasswordByEmail(email,newPassword, confirmPassword);
    }

    @Override
    public UserDto updateProfile(UserDto userDto, UserDto sessionDto, MultipartFile multipartFile)  {

        if (multipartFile.isEmpty())
        {
            log.info("file is empty");
        }
        else {
            try {
                byte[] bytes= multipartFile.getBytes();
                Path path= Paths.get(ServiceConstant.FILE_PATH.getPath()+multipartFile.getOriginalFilename());
                Files.write(path,bytes);
            }
           catch (IOException e){
                log.error("{}",e.getMessage());
           }

        }
        log.info("running update profile serviceimpl{}");
      //  UserEntity  userByEmail=userRepository.getEntityByEmail(userDto.getEmail());
        UserEntity userEntity=new UserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        userEntity.setUserId(sessionDto.getUserId());
        userEntity.setUpdatedBy(sessionDto.getEmail());
        userEntity.setUpdatedDate(LocalDate.now());
        userEntity.setCreatedBy(sessionDto.getFirstName());
        userEntity.setCreatedDate(LocalDate.now());
        userEntity.setFileName(multipartFile.getOriginalFilename());
        userEntity.setFileType(multipartFile.getContentType());

        log.info("Invoke update profile into repo  {}"+sessionDto);
        UserEntity entity=userRepository.updateProfile(userEntity);
        UserDto userDto1=new UserDto();
        log.info("data is updated");
        BeanUtils.copyProperties(entity,userDto1);
        return userDto1;
    }


}
