package com.pelinhangisi.userauthservice.service;

import com.pelinhangisi.userauthservice.dao.UserRepository;

import com.pelinhangisi.userauthservice.dto.UserRequest;
import com.pelinhangisi.userauthservice.entity.User;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;



@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public void save(UserRequest userRequest){
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setCreateTime(LocalDateTime.now());
        user.setFullname(userRequest.getFullname());
        userRepository.save(user);
    }


    public List<User> findAll(){
        return userRepository.findAll();
    }




    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }
}
