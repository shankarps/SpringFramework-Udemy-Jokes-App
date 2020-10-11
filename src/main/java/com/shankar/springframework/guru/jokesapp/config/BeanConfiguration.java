package com.shankar.springframework.guru.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public ChuckNorrisQuotes createChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }


}
