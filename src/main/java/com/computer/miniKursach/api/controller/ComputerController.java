package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.models.client_service.GetClient;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.dal.repositories.ClientRepository;
import com.computer.miniKursach.dal.repositories.ComputerRepository;
import com.computer.miniKursach.web.models.DeleteRequest;
import com.computer.miniKursach.web.models.computer.PostComputerRequest;
import com.computer.miniKursach.web.models.computer.PutComputerRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/computer")
public class ComputerController {

    @Autowired
    public ComputerRepository computerRepository;

    @Autowired
    public IComputerService computerService;


//
//    private IComputerService computerService;
//
//    public ComputerController(IComputerService computerService) {
//        this.computerService = computerService;
//    }
//
    @GetMapping
    public ResponseEntity getComputers()
    {
        try{
//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(computerService.getAll());
            var computers = computerRepository.findAll();
//            var computers2 = new ArrayList<>();
//            for (ClientEntity client : computers) {
//                computers2.add(new GetClient(client.getId(), client.getName(), client.getPhone_number()));
//            }
            return ResponseEntity.ok(computers);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
//
    @PostMapping
    public ResponseEntity postComputer(@RequestBody PostComputerRequest entity)
    {
        try{
            computerService.create(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
//
    @PutMapping
    public ResponseEntity putComputer(@RequestBody PutComputerRequest entity)
    {
        try{
            computerService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping()
    public ResponseEntity deleteComputer(@RequestParam int id)
    {
        try{
            computerService.delete(id);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
}
