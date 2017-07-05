"use strict";

class Greeting{

    constructor(greetingID, greetingContent){
        this.greetingID = greetingID;
        this.greetingContent = greetingContent;
    }

    getGreetingID(){ return this.greetingID; }
    getGreetingContent(){ return this.greetingContent; }

    static getAndIncrementCounter(){ 
        Greeting.greetingCounter++;
        return Greeting.greetingCounter; 
    }

};

module.exports = Greeting;