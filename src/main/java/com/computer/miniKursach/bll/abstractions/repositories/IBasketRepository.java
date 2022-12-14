package com.computer.miniKursach.bll.abstractions.repositories;

import com.computer.miniKursach.dal.entities.BasketEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBasketRepository {
    public void create(BasketEntity entity) throws SQLException;
    public void update(BasketEntity entity) throws SQLException;
    public void delete(int id) throws SQLException;
    public ArrayList<BasketEntity> getAll() throws SQLException;
}
