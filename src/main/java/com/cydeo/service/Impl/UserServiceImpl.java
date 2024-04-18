package com.cydeo.service.Impl;

import com.cydeo.dto.UserDto;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends AbstractMapService<UserDto,String> implements UserService {
    @Override
    public UserDto save(UserDto object) {
        return super.save(object.getUserName(),object);
    }

    @Override
    public List<UserDto> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String id) {
        super.deleteById(id);

    }

    @Override
    public void update(UserDto object) {
        super.update(object.getUserName(),object);

    }

    @Override
    public UserDto findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<UserDto> findManagers() {
        return super.findAll().stream().filter(user -> user.getRole().getId() ==2).collect(Collectors.toList());
    }
    @Override
    public List<UserDto> findEmployees() {
        return super.findAll().stream().filter(user -> user.getRole().getId() == 3).collect(Collectors.toList());
    }

}
