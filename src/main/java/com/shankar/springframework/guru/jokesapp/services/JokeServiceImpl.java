package com.shankar.springframework.guru.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Service
//Declared as a bean in XML config
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
