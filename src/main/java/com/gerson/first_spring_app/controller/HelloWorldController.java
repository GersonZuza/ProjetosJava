package com.gerson.first_spring_app.controller;

import com.gerson.first_spring_app.domain.User;
import com.gerson.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld() {

        return helloWorldService.helloWorld("Gerson");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + filter;
    }
}
