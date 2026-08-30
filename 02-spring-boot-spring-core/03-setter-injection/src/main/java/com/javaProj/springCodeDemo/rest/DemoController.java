package com.javaProj.springCodeDemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaProj.util.Coach;

@RestController
public class DemoController {

    //Define a private field for dependency in which spring injects the Coach object
    private Coach myCoach;

    //Define a constructor for dependency injection
    //Autowired tells spring to inject dependency into this contstructor
    /* So when the rest controller fires, it gets the Coach object in theCoach via spring
    The Coach type variable which can take Coach object is assigned the Coach object*/
    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;

        /* In normal java method I would've done something like
        Coach myCoach = new CricketCoach();
        myCoach.getDailyWorkout()
        But we need an extra wiring in between since we are using spring*/
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkoutMapping(){
        return myCoach.getDailyWorkout();
    }

    /* My coach.java is the interface. My CricketCoach implements that into a class and in the function 
    I have the actual thing that has to be returned. Now to show it on the screen 
    we need to have a REST controller to read the endpoint user is trying to access and accordinly gibve output

    So in getmapping, I have given the exact endpoint to trigger this. 
    It has the function getDailyWorkout linked to the endpoint. If it is ever called, 
    it injects Coach object into myCoach which is Coach class's getDailyWorkout method where the 
    string value is there. It gets triggered and data is displayed */

}
