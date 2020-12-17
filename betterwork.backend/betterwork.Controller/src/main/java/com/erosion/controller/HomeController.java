package com.erosion.controller;

import com.erosion.core.annotation.MinutesRequestLimit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @MinutesRequestLimit
    @GetMapping("home")
    public String Home()
    {
        return "This is BetterWork Home!";
    }

}
