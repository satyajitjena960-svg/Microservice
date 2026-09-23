package com.UserService.controller;

import com.UserService.entity.User;
import com.UserService.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService u;
    public UserController(UserService uu){
       this.u=uu;
    }
    @PostMapping("/create")
    public String create(@RequestBody User u1){
        u.createUser(u1);
        return "Success";
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
       return u.getAllUser();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable String id){
        User u1=u.getOneUser(id);
        return u1;
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable String id,@RequestBody User u1){
        boolean x=u.updateUser(id,u1);
        if(x){
            return "Success";
        }
        return "Data not found";
    }

    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable String id){
        return u.deleteUser(id);
    }
}
