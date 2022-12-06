package com.computer.miniKursach.web.controllers;

import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.repositories.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComputerWebController {

    @Autowired
    public ComputerRepository computerRepository;

    @Autowired
    public IComputerService computerService;

    @GetMapping("/computer")
    public String computer(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model
    ){
        var computers = computerService.getComputer();

        model.addAttribute("computers", computers);

        return "computer";
    }
}
