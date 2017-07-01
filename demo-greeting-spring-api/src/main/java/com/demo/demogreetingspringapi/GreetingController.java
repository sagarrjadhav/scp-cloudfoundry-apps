package com.demo.demogreetingspringapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{

    private static final String greetingTemplate = "Hello, %s. Ready to develop and deploy apps on the CF runtime ?";
    private final AtomicLong counter = new AtomicLong();

    // Request handler for '/greet'
    // Set the default value of the parameter - name to 'World'
    @RequestMapping("/greet")
    public Greeting greet(@RequestParam(name = "name", defaultValue = "World") String name){

        // The object content does not need to be JSONified explicitly as it as already taken care by the controller
        // due to usage of the @RestController annotation
        return new Greeting(counter.incrementAndGet(), String.format( greetingTemplate, name));
    }
}