package com.computer.miniKursach.bll.repositories;

import com.computer.miniKursach.dal.entities.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<ComputerEntity, Integer> {

}
