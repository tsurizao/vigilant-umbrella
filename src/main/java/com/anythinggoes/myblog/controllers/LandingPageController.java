package com.anythinggoes.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingPageController {
    @GetMapping("/")
    @ResponseBody
    public String showLandingPage(){
        return "index";
    }
}
