package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.repositories.IBasketRepository;
import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class BasketService implements IBasketService {

    private IBasketRepository basketRepository;
    public BasketService(IBasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public void create(BasketEntity entity) throws SQLException {
        basketRepository.create(entity);
    }

    @Override
    public void update(BasketEntity entity) throws SQLException {
        basketRepository.update(entity);
    }

    @Override
    public void delete(int id) throws SQLException {
        basketRepository.delete(id);
    }

    @Override
    public ArrayList<BasketEntity> getAll() throws SQLException {
        return basketRepository.getAll();
    }
}
