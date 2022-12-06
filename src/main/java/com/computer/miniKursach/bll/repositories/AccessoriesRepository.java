package com.computer.miniKursach.bll.repositories;

import com.computer.miniKursach.dal.entities.AccessoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessoriesRepository extends JpaRepository<AccessoriesEntity, Integer> {
//    List<AccessoriesEntity> getAccessories();
}
