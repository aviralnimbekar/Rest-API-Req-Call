package com.bridgelabz.restapiexample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiCallsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz. This is Hello message from Rest call";
    }

    @GetMapping("/hello/query")
    public String getParamMessage(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz. This is Param message";
    }

    @GetMapping("/hello/param/{name}")
    public String getPathMessage(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz. This is Path message";
    }
}
