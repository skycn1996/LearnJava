package com.southwind.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/hello",produces = "text/html;charset=utf-8")
    public String hello(){
        return "南无阿弥陀佛";
    }
}
