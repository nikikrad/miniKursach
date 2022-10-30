package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.repositories.IClientRepository;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.dal.infrastructure.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class ClientRepository implements IClientRepository {
    @Override
    public void create(ClientEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("INSERT INTO client (name, phone_number) VALUES ('%s', '%s') ", entity.name, entity.phone_number));
    }

    @Override
    public void update(ClientEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("UPDATE client set name = '%s', phone_number = '%s' where id = '%s'", entity.name, entity.phone_number, entity.id));
    }

    @Override
    public void delete(int id) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("DELETE FROM client where id = '%s'", id));
    }

    @Override
    public ArrayList<ClientEntity> getAll() throws SQLException {
        var resultSet = DBConnection.statement.executeQuery(String.format("SELECT * FROM client"));
        var result = new ArrayList<ClientEntity>(0);
        while (resultSet.next())
        {
            var client = new ClientEntity();
            client.id = resultSet.getInt("id");
            client.name = resultSet.getString("name");
            client.phone_number = resultSet.getString("phone_number");
            result.add(client);
        }
        return result;
    }
}
