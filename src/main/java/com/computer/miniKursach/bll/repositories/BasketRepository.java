package com.computer.miniKursach.bll.repositories;

import com.computer.miniKursach.dal.entities.BasketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<BasketEntity, Integer> {
//    void createBasket(CreateBasket entity);
}
