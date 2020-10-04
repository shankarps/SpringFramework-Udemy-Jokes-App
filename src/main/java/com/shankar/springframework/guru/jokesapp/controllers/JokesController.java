package com.shankar.springframework.guru.jokesapp.controllers;

import com.shankar.springframework.guru.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService){
        this.jokeService = jokeService;
    }

    @RequestMapping(path={"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "joke";
    }
}
