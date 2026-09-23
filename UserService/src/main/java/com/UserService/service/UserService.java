package com.UserService.service;

import com.UserService.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getAllUser();
    User getOneUser(String id);
   User createUser(User u);
   boolean updateUser(String id,User u);
   boolean deleteUser(String id);

}
