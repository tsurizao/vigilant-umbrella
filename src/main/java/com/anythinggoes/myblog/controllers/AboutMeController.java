package com.anythinggoes.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutMeController {
    @GetMapping("/about")
    public String showAboutMe(){
        return "about";
    }
}
