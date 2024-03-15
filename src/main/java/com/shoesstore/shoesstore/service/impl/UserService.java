package com.shoesstore.shoesstore.service.impl;

import com.shoesstore.shoesstore.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> getAllUser();

    void saveUser(Users User);

    void deleteUser(int id);

    Optional<Users> findUserById(int id);
}
