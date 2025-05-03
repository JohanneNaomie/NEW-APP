package com.example.erpapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "Spring Boot is working!";
    }
}
