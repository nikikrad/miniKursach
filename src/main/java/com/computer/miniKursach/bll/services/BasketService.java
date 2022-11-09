package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.models.basket_service.CreateBasket;
import com.computer.miniKursach.bll.abstractions.models.basket_service.GetBasket;
import com.computer.miniKursach.bll.abstractions.repositories.IBasketRepository;
import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.dal.repositories.BasketRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class BasketService implements IBasketService {

    private BasketRepository basketRepository;


    @Override
    public GetBasket getBasketByUserId(int userId) {
        return null;
    }

    @Override
    public void create(CreateBasket entity) {

    }

    @Override
    public void addUpdateBasket(int id, Optional<String> total_price) throws AuthenticationException {

    }
}
