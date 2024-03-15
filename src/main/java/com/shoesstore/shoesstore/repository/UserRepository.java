package com.shoesstore.shoesstore.repository;

import com.shoesstore.shoesstore.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    @Query(name = "Users.findByUsernameAndPassword")
    Users findByUsernameAndPassword(String username, String password);
}
