package com.example.flowableexpression.controllers;

import org.flowable.engine.RuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    private final RuntimeService runtimeService;

    public StartController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }


    @GetMapping("/")
    public String hello(){

        runtimeService.startProcessInstanceByKey("expressionProcess");

        return "Hi there";
    }
}
