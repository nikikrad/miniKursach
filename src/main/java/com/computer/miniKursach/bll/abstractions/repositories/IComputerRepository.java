package com.computer.miniKursach.bll.abstractions.repositories;

import com.computer.miniKursach.dal.entities.ComputerEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IComputerRepository {
    public void create(ComputerEntity entity) throws SQLException;
    public void update(ComputerEntity entity) throws SQLException;
    public void delete(int id) throws SQLException;
    public ArrayList<ComputerEntity> getAll() throws SQLException;

}
