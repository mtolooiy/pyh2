package com.nrdc.pyh2.modules.users.service;

import com.nrdc.pyh2.modules.users.model.Users;
import com.nrdc.pyh2.modules.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    // logic of program ==> data validation
    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users registerUser (Users user){
        return this.usersRepository.save(user);
    }

    public List<Users> findAllUsers(){
        return  this.usersRepository.findAll();
    }
}
