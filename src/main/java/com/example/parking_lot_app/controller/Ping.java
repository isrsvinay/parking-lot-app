package com.example.parking_lot_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ping")
public class Ping {

    @GetMapping()
    public String ping() {
        System.out.println("ping success");
        return "Your system is healthy";
    }
}
