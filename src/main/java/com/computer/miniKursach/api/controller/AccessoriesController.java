package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.services.AccessoriesService;
import com.computer.miniKursach.bll.repositories.AccessoriesRepository;
import com.computer.miniKursach.web.models.accessories.DeleteAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PostAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PutAccessoriesRequest;
import com.computer.miniKursach.web.models.computer.DeleteComputerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/devices")
public class AccessoriesController {

    @Autowired
    public AccessoriesService accessoriesService;
    @Autowired
    public AccessoriesRepository accessoriesRepository;

    @GetMapping
    public ResponseEntity getDevices()
    {
        try{
            var accessories = accessoriesRepository.findAll();

//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(devicesService.getAll());
            return ResponseEntity.ok(accessories);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping
    public ResponseEntity postDevices(@RequestBody PostAccessoriesRequest entity)
    {
        try{
            accessoriesService.create(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PutMapping
    public ResponseEntity putDevices(@RequestBody PutAccessoriesRequest entity)
    {
        try{
            accessoriesService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping
    public ResponseEntity deleteDevices(@RequestBody DeleteAccessoriesRequest id)
    {
        try{
            accessoriesService.delete(id.getId());
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
}
