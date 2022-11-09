package com.computer.miniKursach.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeWebController {
    @GetMapping("/")
    public String computer(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model
    ){
        model.addAttribute("name", name);
        return "home";
    }

}
