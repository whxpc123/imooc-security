package com.imooc.security.web.controller;

import com.imooc.security.domin.User;
import com.imooc.security.dto.UserDto;
import com.imooc.security.util.BeanValidator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/user")
    public Object getCurrent(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/simpleInfo")
    public Object getSimpleInfo(@AuthenticationPrincipal Authentication authentication){
        return authentication;
    }

    @GetMapping("/test")
    public String test(){
        return "helloWorld";
    }
    @PostMapping("/find")
    public User find(){
        return new User("xpc","123456");
    }

    @PostMapping("/create")
    public User create(@RequestBody UserDto user){
        BeanValidator.check(user);
        return new User();
    }

    @GetMapping("/{id:\\d+}")
    public User findById(@PathVariable Integer id){
        return null;
    }

}
