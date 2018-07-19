package com.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${common.system.name}")
    private String systemName;

    @GetMapping("")
    public String index(){
        return "System name is: " + systemName;
    }
}
