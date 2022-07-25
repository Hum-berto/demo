package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("hello")

public class UserController {

    @GetMapping("person")
    public String home() {
        return "Hello Luis and Gerardo -------> teacher : colochin";
    }


    @GetMapping("prueba")
    public String prueba() {
        return "aqui sierra 117 ";
    }


}
