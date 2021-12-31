package com.egydriver.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Abdo Motaz";
    }

}
