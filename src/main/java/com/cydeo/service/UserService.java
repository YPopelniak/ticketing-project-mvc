package com.cydeo.service;

import com.cydeo.dto.UserDto;

import java.util.List;

public interface UserService extends CrudService <UserDto,String> {

    List<UserDto> findManagers();
    List<UserDto> findEmployees();

}
