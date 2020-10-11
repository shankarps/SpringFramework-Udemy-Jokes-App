package com.shankar.springframework.guru.jokesapp.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");

    }

    @Bean
    @Profile({"es"})
    public GreetingService spanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("es");
    }

}
