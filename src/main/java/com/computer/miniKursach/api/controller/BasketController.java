package com.computer.miniKursach.api.controller;

import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.repositories.BasketRepository;
import com.computer.miniKursach.web.models.basket.PutBasketRequest;
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
    @GetMapping("api/basket-id")
    public ResponseEntity getBasketById(@RequestParam int id)
    {
        try{
            var basket = basketService.getBasketByUserId(id);
//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(basketRepository.findAll());
            return ResponseEntity.ok(basket);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @GetMapping
    public ResponseEntity getAllBasket()
    {
        try{
            var basket = basketService.getAllBasket();
//            var resStr = new ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(basketRepository.findAll());
            return ResponseEntity.ok(basket);
        }
        catch (Exception e)
        {
            return internalServerError().body("Some problem with server!");
        }
    }

    @PutMapping
    public ResponseEntity putBasket(@RequestBody PutBasketRequest entity) {
        try {
            basketService.update(entity);
            return ResponseEntity.ok().body("Все ок!");
        } catch (Exception e) {
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
