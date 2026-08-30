package com.javaProj.springCodeDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaProj.springCodeDemo.common.Coach;

@RestController
public class DemoController {

    //Define a private field for dependency in which spring injects the Coach object
    private Coach myCoach;

    /* Setter injection */
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkoutMapping(){
        return myCoach.getDailyWorkout();
    }

}
