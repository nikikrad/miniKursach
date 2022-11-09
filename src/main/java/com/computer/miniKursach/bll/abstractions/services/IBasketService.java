package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.abstractions.models.basket_service.CreateBasket;
import com.computer.miniKursach.bll.abstractions.models.basket_service.GetBasket;
import com.computer.miniKursach.bll.entities.BasketEntity;

import javax.naming.AuthenticationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public interface IBasketService {
    GetBasket getBasketByUserId(int userId);
    void create(CreateBasket entity);
    void addUpdateBasket(int id, Optional<String> total_price) throws AuthenticationException;
}
