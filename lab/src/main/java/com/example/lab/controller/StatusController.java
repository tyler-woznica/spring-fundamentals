package com.example.lab.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    @GetMapping("/arrival")
    public String sayHello () {
        return "springfundamentals/hello";
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return "springfundamentals/goodbye";
    }
}