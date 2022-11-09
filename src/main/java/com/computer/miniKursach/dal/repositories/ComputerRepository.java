package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.entities.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<ComputerEntity, Integer> {

}
