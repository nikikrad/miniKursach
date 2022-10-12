package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/computer")
public class ComputerController {

    private IComputerService computerService;

    public ComputerController(IComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping
    public ResponseEntity getComputers()
    {
        try{
            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(computerService.getAll());
            return ResponseEntity.ok(resStr);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping
    public ResponseEntity postComputer(@RequestBody ComputerEntity entity)
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

    @PutMapping
    public ResponseEntity putComputer(@RequestBody ComputerEntity entity)
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

    @DeleteMapping
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
