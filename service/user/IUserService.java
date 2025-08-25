package com.husam.oneshop.service.user;

import com.husam.oneshop.dto.UserDto;
import com.husam.oneshop.model.User;
import com.husam.oneshop.request.CreateUserRequest;
import com.husam.oneshop.request.UpdateUserRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertUserToDto(User user);
    User getAuthenticatedUser();
}
