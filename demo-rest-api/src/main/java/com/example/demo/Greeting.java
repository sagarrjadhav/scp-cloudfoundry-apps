package com.example.demo;

public class Greeting {

    private final long greetingID;
    private final String content;

    public Greeting( long greetingID, String content){
        this.greetingID = greetingID;
        this.content = content;
    }

    public long getGreetingID(){ return this.greetingID; }
    public String getContent(){ return this.content; }
}