package com.demo.demogreetingspringapi;

public class Greeting{
    private final long greetingID;   
    private final String greetingContent;

    public Greeting( long greetingID, String greetingContent){
        this.greetingID = greetingID;
        this.greetingContent = greetingContent;
    }

    public long getGreetingID(){ return this.greetingID; }
    public String getGreetingContent(){ return this.greetingContent; }
}