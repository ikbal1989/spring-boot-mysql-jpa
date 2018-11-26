package com.tutorial.springbootmysqlmavenhibernate.resource;

import com.tutorial.springbootmysqlmavenhibernate.model.Users;
import com.tutorial.springbootmysqlmavenhibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersController {

    @Autowired
    UserRepository usersRepository;

//    @Query("SELECT * FROM users LEFT JOIN users_profile ON users.id = users_profile.user_id")
    @GetMapping("/user-profile")
    public List<Users> getUserProfile(){
        return usersRepository.findAll();
    }

    @GetMapping
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

}
