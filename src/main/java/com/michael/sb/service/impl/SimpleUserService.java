/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.sb.service.impl;

import com.michael.sb.entity.User;
import com.michael.sb.repo.UserRepo;
import com.michael.sb.service.UserService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Michael
 */
@Service("userService")
public class SimpleUserService extends SimpleAbstractService<User> implements UserService {

    @Autowired
    public UserRepo userRepo;

    public UserRepo getRepo() {
        return userRepo;
    }

//    @Autowired
//    public void setRepo(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
    @Override
    public void printmmm() {
        userRepo.printmmm();
    }

    public Optional<User> loadByUsername(String username) {
        return userRepo.findByUsername(username);
    }

}
