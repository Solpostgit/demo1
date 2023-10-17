package com.example.demo1.controller;

import com.example.demo1.service.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class FirstController {
   //private int requestCounter;
   private final CounterService counterService;
    public FirstController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/counter")
    public String showCounter() {
        return "Количество запросов: " + counterService.getRequestCount();
    }

    @GetMapping("/greetings")
    public String showGreetings(String name, String lastName) {
        return "Hello, " + lastName + " " + name + "!";
    }

}
