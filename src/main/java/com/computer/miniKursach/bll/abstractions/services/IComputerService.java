package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.entities.ComputerEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IComputerService {
    public void create(ComputerEntity entity) throws SQLException;
    public void update(ComputerEntity entity) throws SQLException;
    public void delete(int id) throws SQLException;
    public ArrayList<ComputerEntity> getAll() throws SQLException;
}
