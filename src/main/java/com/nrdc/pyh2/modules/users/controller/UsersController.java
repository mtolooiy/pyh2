package com.nrdc.pyh2.modules.users.controller;

import com.nrdc.pyh2.modules.users.model.Users;
import com.nrdc.pyh2.modules.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = {"/",""} , method = RequestMethod.GET)
    public List<Users> getUsers(){
        return usersService.findAllUsers();
    }

    @RequestMapping(value = {"/",""} , method = RequestMethod.POST)
    public Users registerUser(@RequestBody Users user){
        return usersService.registerUser(user);
    }
}
// 353300073058692
// 09122164953