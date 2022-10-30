package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.repositories.IClientRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.entities.ClientEntity;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class ClientService implements IClientService {

    private IClientRepository clientRepository;
    public ClientService(IClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(ClientEntity entity) throws SQLException {
        clientRepository.create(entity);
    }

    @Override
    public void update(ClientEntity entity) throws SQLException {
        clientRepository.update(entity);
    }

    @Override
    public void delete(int id) throws SQLException {
        clientRepository.delete(id);
    }

    @Override
    public ArrayList<ClientEntity> getAll() throws SQLException {
        return clientRepository.getAll();
    }
}
