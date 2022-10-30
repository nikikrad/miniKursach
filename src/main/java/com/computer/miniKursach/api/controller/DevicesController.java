package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.abstractions.services.IDevicesService;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.bll.entities.DevicesEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/devices")
public class DevicesController {


    private IDevicesService devicesService;

    public DevicesController(IDevicesService devicesService) {
        this.devicesService = devicesService;
    }

    @GetMapping
    public ResponseEntity getDevices()
    {
        try{
            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(devicesService.getAll());
            return ResponseEntity.ok(resStr);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping
    public ResponseEntity postDevices(@RequestBody DevicesEntity entity)
    {
        try{
            devicesService.create(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PutMapping
    public ResponseEntity putDevices(@RequestBody DevicesEntity entity)
    {
        try{
            devicesService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping
    public ResponseEntity deleteDevices(@RequestParam int id)
    {
        try{
            devicesService.delete(id);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
}
