var express = require("express");

// Create an express Server
var expressServer = express();

// Script the HTTP GET response handler for /greet
expressServer.get("/greet", function(request, response){
    response.json({ greetingContent: "Hello, Sagar. Ready to develop and deploy apps on the CF runtime ?" });
});

// Start the server
expressServer.listen( process.env.PORT || 3000, function(){
    console.log("SERVER STARTED...");
});