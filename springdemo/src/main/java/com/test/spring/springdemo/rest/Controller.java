package com.test.spring.springdemo.rest;

import com.test.spring.springdemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach coach;

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/dailywork")

    public String getCoach() {
        return coach.dailyworkout();
    }
}
