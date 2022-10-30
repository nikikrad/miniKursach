package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.repositories.IDevicesRepository;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.bll.entities.DevicesEntity;
import com.computer.miniKursach.dal.infrastructure.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class DevicesRepository implements IDevicesRepository {

    @Override
    public void create(DevicesEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("INSERT INTO accessories (name_device, group, price) VALUES ('%s', '%s', '%s') ", entity.name_device, entity.group,entity.price));
    }

    @Override
    public void update(DevicesEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("UPDATE accessories set name_device = '%s', group = '%s',price = '%s' where id = '%s'", entity.name_device, entity.group,entity.price, entity.id));
    }

    @Override
    public void delete(int id) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("DELETE FROM accessories where id = '%s'", id));
    }

    @Override
    public ArrayList<DevicesEntity> getAll() throws SQLException {
        var resultSet = DBConnection.statement.executeQuery(String.format("SELECT * FROM accessories"));
        var result = new ArrayList<DevicesEntity>(0);
        while (resultSet.next())
        {
            var devices = new DevicesEntity();
            devices.id = resultSet.getInt("id");
            devices.name_device = resultSet.getString("name_device");
            devices.group = resultSet.getString("group");
            devices.price = resultSet.getDouble("price");
            result.add(devices);
        }
        return result;
    }
}
