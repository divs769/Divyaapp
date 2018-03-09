package com.shopdirect;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello/{greeting}")
    public String hello(@PathVariable String greeting) {
        return "Greetings from "+greeting;

    }
}
