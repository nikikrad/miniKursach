package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.models.client_service.GetClient;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.dal.entities.ClientEntity;
import com.computer.miniKursach.bll.repositories.ClientRepository;
import com.computer.miniKursach.web.models.client.DeleteClientRequest;
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
    public ResponseEntity deleteClient(@RequestBody DeleteClientRequest id) {
        try{
            clientService.delete(id.getId());
            return ResponseEntity.ok().body("Все ок!");
        }catch (Exception e){
            return internalServerError().body("Some problem with server!");
        }
    }
}
