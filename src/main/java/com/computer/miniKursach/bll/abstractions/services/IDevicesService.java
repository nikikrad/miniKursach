package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.bll.entities.DevicesEntity;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDevicesService {
    public void create(DevicesEntity entity) throws SQLException;
    public void update(DevicesEntity entity) throws SQLException;
    public void delete(int id) throws SQLException;
    public ArrayList<DevicesEntity> getAll() throws SQLException;
}
