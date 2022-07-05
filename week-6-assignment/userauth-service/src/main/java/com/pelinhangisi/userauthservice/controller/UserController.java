package com.pelinhangisi.userauthservice.controller;

import com.pelinhangisi.userauthservice.dto.UserLoginRequest;
import com.pelinhangisi.userauthservice.dto.UserRequest;
import com.pelinhangisi.userauthservice.entity.User;
import com.pelinhangisi.userauthservice.security.JwtProvider;
import com.pelinhangisi.userauthservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
@RequiredArgsConstructor
public class UserController {

    private final JwtProvider jwtProvider;
    private final AuthenticationManager authenticationManager;
    private final UserService userService;

    //kullanıcı kayıt yapabilmesi adına oluşturulan bölüm
    @PostMapping("/signup")
    public void signUp(@RequestBody UserRequest userRequest){
        userService.save(userRequest);
    }

    //kullanıcı giriş yapabilmesi adına oluşturulan bölüm
    @PostMapping("/signin")
    public String getToken(@RequestBody UserLoginRequest userLoginRequest) throws Exception{
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userLoginRequest.getUsername(), userLoginRequest.getPassword()));
        } catch (BadCredentialsException exception){
            throw new Exception("Username not found" , exception);
        }
        final UserDetails userDetails = userService.loadUserByUsername(userLoginRequest.getUsername());
        final String jwt = jwtProvider.generateToken(userDetails);
        return jwt;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }


}
