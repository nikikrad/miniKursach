package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.models.basket_service.CreateBasket;
import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.dal.entities.BasketEntity;
import com.computer.miniKursach.bll.repositories.BasketRepository;
import com.computer.miniKursach.web.models.basket.PutBasketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Service
public class BasketService implements IBasketService {

    @Autowired
    private BasketRepository basketRepository;


    @Override
    public List<BasketEntity> getAllBasket() {
        var basketList = basketRepository.findAll();
        return basketList;
    }

    @Override
    public BasketEntity getBasketByUserId(int userId) {
        var basket =  basketRepository.findById(userId);
        return basket.get();
    }

    @Override
    public void create(CreateBasket entity) {

    }

    @Override
    public void update(PutBasketRequest entity) throws AuthenticationException {
        var basketEntity = new BasketEntity();
        basketEntity.setId(entity.getId());
        basketEntity.setTotal_price(entity.getTotal_price());
        basketRepository.save(basketEntity);
    }
}
