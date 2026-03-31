package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from AWS By Srikar 🚀";
    }
    @GetMapping("/check")
public String check() {
	return "Check jerkins from AWS by srikar 🚀";
}
	    @GetMapping("/test")
    public String test() {
        return "triggering test from github";
    }
}
