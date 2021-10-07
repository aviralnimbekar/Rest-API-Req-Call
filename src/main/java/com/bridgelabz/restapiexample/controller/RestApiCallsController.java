package com.bridgelabz.restapiexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiCallsController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello from BridgeLabz. This is Hello message from Rest call";
    }

    @GetMapping("/queryParam")
    public String getParamMessage(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz. This is Param message";
    }
}
