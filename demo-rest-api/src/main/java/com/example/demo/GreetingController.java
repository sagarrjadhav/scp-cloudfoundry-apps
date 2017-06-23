package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController{
    private static final String template = "Hello, %s. Ready to develop and deploy apps on the CF runtime ?";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/spring/greeting")
    public Greeting greeting(@RequestParam(name = "name", defaultValue = "World") String name){

        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}


