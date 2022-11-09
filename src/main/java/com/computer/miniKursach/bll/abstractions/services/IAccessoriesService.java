package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.entities.AccessoriesEntity;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.web.models.accessories.PostAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PutAccessoriesRequest;
import com.computer.miniKursach.web.models.client.PostClientRequest;
import com.computer.miniKursach.web.models.client.PutClientRequest;

import java.sql.SQLException;
import java.util.List;

public interface IAccessoriesService {
    List<AccessoriesEntity> getAccessories();
    void create(PostAccessoriesRequest createClient);
    void update(PutAccessoriesRequest entity) throws SQLException;
    void delete(int id) throws SQLException;

}
