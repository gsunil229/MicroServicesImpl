package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    //fake user list

    List<User> list=List.of(
            new User(1L,"Sunil","12345"),
            new User(2L,"Pritesh","12388600"),
            new User(3L,"Tej","1267839")
    );


    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
