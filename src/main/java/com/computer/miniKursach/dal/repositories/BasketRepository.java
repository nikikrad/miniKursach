package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.models.basket_service.CreateBasket;
import com.computer.miniKursach.bll.entities.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketEntity, Integer> {
//    void createBasket(CreateBasket entity);
}
