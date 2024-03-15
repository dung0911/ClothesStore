package com.shoesstore.shoesstore.service;

import com.shoesstore.shoesstore.entity.Users;
import com.shoesstore.shoesstore.repository.UserRepository;
import com.shoesstore.shoesstore.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAllUser() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public void saveUser(Users User) {
        userRepository.save(User);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<Users> findUserById(int id) {
        return userRepository.findById(id);
    }
}
