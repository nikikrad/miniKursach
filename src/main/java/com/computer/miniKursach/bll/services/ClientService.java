package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.dal.repositories.BasketRepository;
import com.computer.miniKursach.dal.repositories.ClientRepository;
import com.computer.miniKursach.web.models.client.PostClientRequest;
import com.computer.miniKursach.web.models.client.PutClientRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private BasketService basketService;


    @Override
    public List<ClientEntity> getClient() {
        var clients = clientRepository.findAll();
        return clients;
    }

    @Override
    public void create(PostClientRequest createClient) {
        var clientEntity = new ClientEntity();
        clientEntity.setName(createClient.getName());
        clientEntity.setPhone_number(createClient.getPhone_number());
        var basket = new BasketEntity();
        basket.setTotal_price(0.0);
        basketRepository.save(basket);
        clientEntity.setBasket(basket);
//        clientEntity.setBasket(createClient.getBasket().);

//            var existCategory = basketRepository.findById(createClient.getBasket().id);
//            if(!existCategory.isEmpty()){
//                clientEntity.setBasket(existCategory.get());
//            }

        clientRepository.save(clientEntity);
    }
    @Override
    public void update(PutClientRequest entity) throws SQLException {
        var clientEntity = new ClientEntity();
        clientEntity.setId(entity.getId());
        clientEntity.setName(entity.getName());
        clientEntity.setPhone_number(entity.getPhone_number());
//        clientEntity.setId(entity.getBasketId());
        var basket = new BasketEntity();
        basket.setId(entity.getId());
        basket.setTotal_price(0.0);
        basketRepository.save(basket);
//        clientEntity.setBasket(new BasketEntity());
        clientEntity.setBasket(basket);

//            var existCategory = basketRepository.findById(createClient.getBasket().id);
//            if(!existCategory.isEmpty()){
//                clientEntity.setBasket(existCategory.get());
//            }

        clientRepository.save(clientEntity);
    }

    @Override
    public void delete(int id) throws SQLException {
        clientRepository.deleteById(id);
    }
//
//    @Override
//    public void delete(int id) throws SQLException {
//        clientRepository.delete(id);
//    }
//
//    @Override
//    public ArrayList<ClientEntity> getAll() throws SQLException {
//        return clientRepository.getAll();
//    }
}
