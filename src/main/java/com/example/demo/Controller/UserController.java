package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @RequestMapping("/")
    public String home() {
        return "Hello Luis and Gerardo ------- teacher : colochin";
    }

}
