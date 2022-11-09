package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.models.client_service.GetClient;
import com.computer.miniKursach.bll.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
