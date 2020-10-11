package com.shankar.springframework.guru.jokesapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
