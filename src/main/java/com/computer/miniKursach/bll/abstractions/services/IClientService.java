package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.web.models.client.PostClientRequest;
import com.computer.miniKursach.web.models.client.PutClientRequest;

import java.sql.SQLException;
import java.util.List;

public interface IClientService {
    List<ClientEntity> getClient();
    void create(PostClientRequest createClient);

    //
    //    private IClientRepository clientRepository;
    //    public ClientService(IClientRepository clientRepository) {
    //        this.clientRepository = clientRepository;
    //    }
    //
    //    @Override
    //    public void create(ClientEntity entity) throws SQLException {
    //        clientRepository.create(entity);
    //    }
    //
    void update(PutClientRequest entity) throws SQLException;

    void delete(int id) throws SQLException;
}
