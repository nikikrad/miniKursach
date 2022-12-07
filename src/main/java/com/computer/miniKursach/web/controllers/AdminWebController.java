package com.computer.miniKursach.web.controllers;


import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.models.accessories_service.GetAccessories;
import com.computer.miniKursach.bll.models.client_service.GetClient;
import com.computer.miniKursach.bll.repositories.ClientRepository;
import com.computer.miniKursach.bll.services.AccessoriesService;
import com.computer.miniKursach.bll.services.BasketService;
import com.computer.miniKursach.dal.entities.ClientEntity;
import com.computer.miniKursach.web.models.client.PostClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class AdminWebController {

    @Autowired
    public ClientRepository clientRepository;

    @Autowired
    public BasketService basketService;

    @Autowired
    public AccessoriesService accessoriesService;

    @Autowired
    public IComputerService computerService;

    @GetMapping("/7afaa0a74c41394c7122fe61723ddc365f322a55/admin")
    public String computer(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model
    ){
        var clientList = clientRepository.findAll();
        var clients = new ArrayList<PostClientRequest>();
        var i = 0;
        var basket = basketService.getAllBasket();
        for (ClientEntity client : clientList) {
            clients.add(new PostClientRequest(client.getId(), client.getName(), client.getPhone_number(), basket.get(i).getTotal_price(), basket.get(i).getId() ));
        }

        var accessoriesList = accessoriesService.getAccessories();
        var computers = computerService.getComputer();
        model.addAttribute("clients", clients);
        model.addAttribute("accessories", accessoriesList);
        model.addAttribute("computers", computers);




        return "admin";
    }

}
