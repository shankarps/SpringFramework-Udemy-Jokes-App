package com.shankar.springframework.guru.jokesapp.controllers;

import com.shankar.springframework.guru.jokesapp.services.GreetingService;
import com.shankar.springframework.guru.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    private final GreetingService greetingService;

    public JokesController(JokeService jokeService, GreetingService greetingService){
        this.jokeService = jokeService;
        this.greetingService = greetingService;
    }

    @RequestMapping(path={"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("greeting", greetingService.sayGreeting());
        return "joke";
    }
}
