package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/basket")
public class BasketController {

    private IBasketService basketService;

    public BasketController(IBasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping
    public ResponseEntity getBasket()
    {
        try{
            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(basketService.getAll());
            return ResponseEntity.ok(resStr);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PostMapping
    public ResponseEntity postBasket(@RequestBody BasketEntity entity)
    {
        try{
            basketService.create(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PutMapping
    public ResponseEntity putBasket(@RequestBody BasketEntity entity)
    {
        try{
            basketService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @DeleteMapping
    public ResponseEntity deleteBasket(@RequestParam int id)
    {
        try{
            basketService.delete(id);
            return ResponseEntity.ok().body("Все ок!");
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }
}
