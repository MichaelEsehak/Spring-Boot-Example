/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.michael.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Michael
 */
@RestController
public class TestController {

    @RequestMapping(value = "/hello")
    public String sayHi() {
        return "hi";
    }

    @RequestMapping(value = "/")
    public String welcome() {
        return "Welcome Michael";
    }

}
