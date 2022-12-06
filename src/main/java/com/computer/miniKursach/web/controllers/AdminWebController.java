package com.computer.miniKursach.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminWebController {

    @GetMapping("/7afaa0a74c41394c7122fe61723ddc365f322a55/admin")
    public String computer(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model
    ){
        model.addAttribute("name", name);
        return "admin";
    }

}
