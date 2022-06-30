package edu.miu.cs545.springsecurityjwt.service;

import edu.miu.cs545.springsecurityjwt.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createNewUser(UserDto userDto);

    List<UserDto> getAllUsers();

    UserDto getUserById(Integer id);

    UserDto updateUserById(Integer id, UserDto userDto);

    void deleteUserById(Integer id);
}
