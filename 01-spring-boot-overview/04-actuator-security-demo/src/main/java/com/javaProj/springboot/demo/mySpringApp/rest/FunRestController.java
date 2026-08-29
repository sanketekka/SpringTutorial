package com.javaProj.springboot.demo.mySpringApp.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    /*Need to expose an endpoint so that my localhost will know what function to actually access
    when we go to that path. GetMapping annotation means GET HTTP method */
    @GetMapping("/")
    public String saysHello(){
        return "Hello from the REST controller!";
    }
}
