/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.sb.controller;

import com.michael.sb.entity.User;
import com.michael.sb.service.UserService;
import com.michael.sb.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael
 */
@RestController
public class WelcomeController {
    
    private final WelcomeService welcomeService;
    @Autowired
    private UserService userService;
    
    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    
    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String test(@PathVariable("userName") String name) {
        return welcomeService.getName(name);
        
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(Model model) {
//        model.addAttribute("name", "Michael");
//        return "index";
//
//    }
    @PreAuthorize("hasRole('Super Admin')")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User listUsers(@PathVariable Integer id) {
//        User u=new User();
//        u.setName("done");
//        userService.save(u);
        // Company c = userService.findAll().iterator().next().getCompany();
        User u = userService.findById(id);
//        u.setRoles(null);
//        u.setCompany(null);
        //  Hibernate.initialize(c.getUsers());

        return u;
        
    }
//
//    @RequestMapping(value = "/logout", method = RequestMethod.GET)
//    public String logout() {
//        SecurityContextHolder.getContext().setAuthentication(null);
//        return "logged out";
//    }
//
//    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
//    public String test() {
//        return "test";
//    }
}
