package com.example.flowableexpression.services;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DemoService {

    public String hello(){
        log.info("executing DemoService.hello()");
        return "hello";
    }
}
