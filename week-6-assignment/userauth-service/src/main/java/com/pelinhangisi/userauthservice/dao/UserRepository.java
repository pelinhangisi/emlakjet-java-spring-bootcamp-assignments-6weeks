package com.pelinhangisi.userauthservice.dao;

import com.pelinhangisi.userauthservice.dto.UserRequest;
import com.pelinhangisi.userauthservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String username);
    void save(UserRequest userRequest);
    List<User> findAll();
}
