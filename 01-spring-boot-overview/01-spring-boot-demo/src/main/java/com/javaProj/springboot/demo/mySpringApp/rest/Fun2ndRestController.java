package com.javaProj.springboot.demo.mySpringApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fun2ndRestController {
    @GetMapping("/product")
    public String secondHello(){
        return "Hello from 2nd REST controller";
    }

}
