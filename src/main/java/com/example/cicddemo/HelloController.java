package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello CI/CD - v2";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
// webhook trigger Fri Jun 12 07:27:40 UTC 2026
// webhook trigger1 Fri Jun 12 07:31:22 UTC 2026
