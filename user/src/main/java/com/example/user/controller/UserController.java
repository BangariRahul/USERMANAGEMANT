package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/Api")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/alluser")
public List<User> findall(){
        return  userService.alluser();
    }

    @GetMapping(value=("alluser/{id}"))
    public User userID(@PathVariable String id){

        return userService.userid(id);
    }

    @PostMapping("adduser")
    public void addus(@RequestBody User usr){
      userService.addUser(usr);
    }
    @GetMapping("deluser/{name}")
    public String delusr(@PathVariable String name){
          return userService.del(name);
    }

}