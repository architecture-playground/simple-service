package com.playground.feature.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String welcomePage() {
        log.info("welcome page");
        return "Hello, k8s World!";
    }

    @GetMapping("/helloworld")
    public String helloWorldPage() {
        log.info("we did request on the hello world page");
        return "Hello world page!";
    }

    @GetMapping("/logpage")
    public String loggPage() {
        log.info("Logging page start here");
        return "logging page";
    }

}

