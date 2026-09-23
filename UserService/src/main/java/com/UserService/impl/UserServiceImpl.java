package com.UserService.impl;

import com.UserService.entity.User;
import com.UserService.exeption.UserNotFoundException;
import com.UserService.repository.UserRepo;
import com.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        List<User> allUsers=userRepo.findAll();
        return allUsers;
    }

    @Override
    public User getOneUser(String id) {
       Optional<User>u= userRepo.findById(id);
       // return u.get();
        return u.orElseThrow(()->new UserNotFoundException("User not present in id"+id));
    }

    @Override
    public User createUser(User u) {
       User u1= userRepo.save(u);
        return u1;
    }

    @Override
    public boolean updateUser(String id, User u) {
        Optional<User> u1=userRepo.findById(id);
        User u2=u1.get();
       u2=u;
       User u3=userRepo.save(u2);
        return true;
    }

    @Override
    public boolean deleteUser(String id) {
        userRepo.deleteById(id);
        return false;
    }
}
