package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class testController {

    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping
    public String test() {
        return "Hello " + version;
    }

}
