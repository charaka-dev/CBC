package com.cbc.commonwebform.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping(value="/healthcheck", produces = MediaType.TEXT_PLAIN_VALUE)
    public String healthCheck(){
        return "Up and running";
    }
}
