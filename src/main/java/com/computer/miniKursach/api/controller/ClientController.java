package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/basket")
public class ClientController {

    private IClientService clientService;

    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity getClient()
    {
        try{
            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(clientService.getAll());
            return ResponseEntity.ok(resStr);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping
    public ResponseEntity postClient(@RequestBody ClientEntity entity)
    {
        try{
            clientService.create(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PutMapping
    public ResponseEntity putClient(@RequestBody ClientEntity entity)
    {
        try{
            clientService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping
    public ResponseEntity deleteClient(@RequestParam int id)
    {
        try{
            clientService.delete(id);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
}
