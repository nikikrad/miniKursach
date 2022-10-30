package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.bll.entities.ComputerEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IClientService {
    public void create(ClientEntity entity) throws SQLException;
    public void update(ClientEntity entity) throws SQLException;
    public void delete(int id) throws SQLException;
    public ArrayList<ClientEntity> getAll() throws SQLException;
}
