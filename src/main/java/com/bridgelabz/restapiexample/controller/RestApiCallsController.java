package com.bridgelabz.restapiexample.controller;

import com.bridgelabz.restapiexample.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class RestApiCallsController {

    @GetMapping({"", "/", "home"})
    public String sayHello() {
        return "Hello from BridgeLabz. This is Hello message from Rest call";
    }

    @GetMapping("query")
    public String getParamMessage(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz. This is Param message";
    }

    @GetMapping("param/{name}")
    public String getPathMessage(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz. This is Path message";
    }

    @PostMapping("post")
    public String getJsonMessage(@RequestBody Person person) {
        return "Hello " + person.getFname() + " " + person.getLname() + " from BridgeLabz. This is post message";
    }

    @PutMapping("put/{fname}")
    public String getPutMessage(@PathVariable String fname, @RequestParam String lname) {
        return "Hello " + fname + " " + lname + " from BridgeLabz. This is put message";
    }
}
