package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.repositories.ComputerRepository;
import com.computer.miniKursach.web.models.client.DeleteClientRequest;
import com.computer.miniKursach.web.models.computer.DeleteComputerRequest;
import com.computer.miniKursach.web.models.computer.PostComputerRequest;
import com.computer.miniKursach.web.models.computer.PutComputerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/computer")
public class ComputerController {

    @Autowired
    public ComputerRepository computerRepository;

    @Autowired
    public IComputerService computerService;

    @GetMapping
    public ResponseEntity getComputers(Model model)
    {
        try{
            var computers = computerRepository.findAll();
            model.addAttribute("computers", computers);
            return ResponseEntity.ok(computers);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
    @GetMapping("test/computer")
    public String computer(Model model){
        var computers = computerService.getComputer();
        model.addAttribute("computers", computers);
        return "computer";
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

    @DeleteMapping
    public ResponseEntity deleteComputer(@RequestBody DeleteComputerRequest id){
        try{
            computerService.delete(id.getId());
            return ResponseEntity.ok().body("Все ок!");
        }catch (Exception e){
            return internalServerError().body("Some problem with server!");
        }
    }
}
