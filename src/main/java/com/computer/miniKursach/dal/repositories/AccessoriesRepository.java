package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.entities.AccessoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccessoriesRepository extends JpaRepository<AccessoriesEntity, Integer> {
//    List<AccessoriesEntity> getAccessories();
}
