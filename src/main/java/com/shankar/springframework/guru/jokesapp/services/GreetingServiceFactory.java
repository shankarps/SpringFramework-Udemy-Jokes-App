package com.shankar.springframework.guru.jokesapp.services;

public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang) {
        switch (lang){
            case "en":
                return new I18nEnglishGreetingServiceImpl();
            case "de":
                return new GermanGreetingServiceImpl();
            default:
                return new GreetingServiceImpl();

        }

    }
}
