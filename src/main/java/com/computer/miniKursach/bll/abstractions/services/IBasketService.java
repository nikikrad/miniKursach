package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.models.basket_service.CreateBasket;
import com.computer.miniKursach.dal.entities.BasketEntity;
import com.computer.miniKursach.web.models.basket.PutBasketRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface IBasketService {

    List<BasketEntity> getAllBasket();
    BasketEntity getBasketByUserId(int userId);
    void create(CreateBasket entity);
    void update(PutBasketRequest entity) throws AuthenticationException;
}
