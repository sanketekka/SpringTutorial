package com.javaProj.springCodeDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Practice dribbling for 30 mins";
    }

}
