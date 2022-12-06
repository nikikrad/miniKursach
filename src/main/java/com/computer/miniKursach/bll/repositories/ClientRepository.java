package com.computer.miniKursach.bll.repositories;

import com.computer.miniKursach.dal.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
