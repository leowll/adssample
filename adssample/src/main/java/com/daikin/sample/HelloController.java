package com.daikin.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/pdf")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
