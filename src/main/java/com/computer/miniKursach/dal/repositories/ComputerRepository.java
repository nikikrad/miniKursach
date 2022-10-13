package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.dal.infrastructure.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;

@Component
public class ComputerRepository implements IComputerRepository {
    public void create(ComputerEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("INSERT INTO computer (ram, hdd, ssd, matherboard, power_unit, system_unit, video_card) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s') ", entity.ram, entity.hdd,entity.ssd,entity.matherboard,entity.power_unit,entity.power_unit,entity.video_card));
    }
    public void update(ComputerEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("UPDATE computer set ram = '%s', hdd = '%s',ssd = '%s',matherboard = '%s',power_unit = '%s',system_unit = '%s',video_card = '%s' where id = '%s'", entity.ram, entity.hdd,entity.ssd,entity.matherboard,entity.power_unit,entity.power_unit,entity.video_card, entity.id));
    }
    public void delete(int id) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("DELETE FROM computer where id = '%s'", id));
    }
    public ArrayList<ComputerEntity> getAll() throws SQLException {
        var resultSet = DBConnection.statement.executeQuery(String.format("SELECT * FROM computer"));
        var result = new ArrayList<ComputerEntity>(0);
        while (resultSet.next())
        {
            var computer = new ComputerEntity();
            computer.id = resultSet.getInt("id");
            computer.ram = resultSet.getString("ram");
            computer.hdd = resultSet.getString("hdd");
            computer.ssd = resultSet.getString("ssd");
            computer.matherboard = resultSet.getString("matherboard");
            computer.power_unit = resultSet.getString("power_unit");
            computer.system_unit = resultSet.getString("system_unit");
            computer.video_card = resultSet.getString("video_card");
            result.add(computer);
        }
        return result;
    }
}
