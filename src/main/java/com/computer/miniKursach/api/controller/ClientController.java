package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.models.client_service.GetClient;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.dal.repositories.ClientRepository;
import com.computer.miniKursach.web.models.client.PostClientRequest;
import com.computer.miniKursach.web.models.client.PutClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.http.ResponseEntity.internalServerError;

@Controller
public class ClientController {

    @Autowired
    public ClientRepository clientRepository;

    @Autowired
    public IClientService clientService;

    @GetMapping("/api/client")
    public ResponseEntity getClient() {
        try {

//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(clientRepository.getClient());
//            System.out.println(resStr);
            var clients = clientRepository.findAll();
            var clients2 = new ArrayList<>();
            for (ClientEntity client : clients) {
                clients2.add(new GetClient(client.getId(), client.getName(), client.getPhone_number()));
            }
            return ResponseEntity.ok(clients2);
        } catch (Exception e) {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping("/api/client")
    public ResponseEntity addClient(@RequestBody PostClientRequest client) {
        try {
            clientService.create(client);
//            var clientModel = new CreateClient();
//            clientModel.setName(client.name);
//            clientModel.setPhone_number(client.phone_number);
//
//            var basketModel = new BasketModelForPostClientRequest();
//            basketModel.id = (client.basket.id);
//            clientModel.setBasket(basketModel);
//
//            clientService.create(clientModel);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex) {
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping("/api/client")
    public ResponseEntity putClient(@RequestBody PutClientRequest entity) {
        try {
            clientService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        } catch (Exception e) {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping("/api/client")
    public ResponseEntity deleteClient(@RequestParam int id) {
        try {
            clientService.delete(id);
            return ResponseEntity.ok().body("Все ок!");
        } catch (Exception e) {
            return internalServerError().body("Some problem with server!");
        }
    }
}
