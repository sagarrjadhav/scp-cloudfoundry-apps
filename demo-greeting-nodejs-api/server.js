"use strict";

const express = require("express");
const Greeting = require("./greeting.js");

var greetingCounter = 1;

// Create an express application
const app = express();

// Script the HTTP GET response handler for /greet
app.get("/greet", (request, response) => {
    var beingGreeted = request.query.name || "World";
    response.json( new Greeting(greetingCounter++, "Hello, " + beingGreeted + ". Ready to develop and deploy apps on the CF runtime ?" ) );
});

// Create the server
var server = app.listen(process.env.PORT || 3000, () => {
    console.log("Server started and listening at port: " + server.address().port);
});