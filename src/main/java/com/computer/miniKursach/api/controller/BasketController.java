package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.models.basket_service.CreateBasket;
import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.bll.services.BasketService;
import com.computer.miniKursach.dal.repositories.BasketRepository;
import com.computer.miniKursach.dal.repositories.ClientRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.internalServerError;

@RestController
@RequestMapping("api/basket")
public class BasketController {
    @Autowired
    public BasketRepository basketRepository;

    @Autowired
    public IBasketService basketService;
    @GetMapping
    public ResponseEntity getBasket()
    {
        try{
            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(basketRepository.findAll());
            return ResponseEntity.ok(resStr);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

//    @PostMapping
//    public ResponseEntity postBasket(@RequestBody CreateBasket entity) {
//        try {
//            basketService.create(entity);
//            return ResponseEntity.ok().body("Все ок!");
//        } catch (Exception e) {
//            return internalServerError().body("Some problem with server!");
//        }
//    }

//
//    private IBasketService basketService;
//
//    public BasketController(IBasketService basketService) {
//        this.basketService = basketService;
//    }
//    @GetMapping
//    public ResponseEntity getBasket()
//    {
//        try{
//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(basketService.getAll());
//            return ResponseEntity.ok(resStr);
//        }
//        catch (Exception e)
//        {
//            return internalServerError().body("Some problem with server!");
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity postBasket(@RequestBody BasketEntity entity)
//    {
//        try{
//            basketService.create(entity);
//            return ResponseEntity.ok().body("Все ок!");
//        }
//        catch (Exception e)
//        {
//            return internalServerError().body("Some problem with server!");
//        }
//    }
//
//    @PutMapping
//    public ResponseEntity putBasket(@RequestBody BasketEntity entity)
//    {
//        try{
//            basketService.update(entity);
//            return ResponseEntity.ok().body("Все ок!");
//        }
//        catch (Exception e)
//        {
//            return internalServerError().body("Some problem with server!");
//        }
//    }
//
//    @DeleteMapping
//    public ResponseEntity deleteBasket(@RequestParam int id)
//    {
//        try{
//            basketService.delete(id);
//            return ResponseEntity.ok().body("Все ок!");
//        }
//        catch (Exception e)
//        {
//            return internalServerError().body("Some problem with server!");
//        }
//    }
}
