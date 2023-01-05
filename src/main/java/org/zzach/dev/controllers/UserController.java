package org.zzach.dev.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/")
public class UserController {

    @GetMapping
    public String hol(){
        return "Hi Bro!!";
    }
}
