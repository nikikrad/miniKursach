package com.computer.miniKursach.dal.repositories;

import com.computer.miniKursach.bll.abstractions.repositories.IBasketRepository;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.bll.entities.DevicesEntity;
import com.computer.miniKursach.dal.infrastructure.DBConnection;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class BasketRepository implements IBasketRepository {
    @Override
    public void create(BasketEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("INSERT INTO basket (total_price) VALUES ('%s') ", entity.total_price));
    }

    @Override
    public void update(BasketEntity entity) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("UPDATE basket set total_price = '%s' where id = '%s'", entity.total_price, entity.id));
    }

    @Override
    public void delete(int id) throws SQLException {
        DBConnection.statement.executeUpdate(String.format("DELETE FROM basket where id = '%s'", id));
    }

    @Override
    public ArrayList<BasketEntity> getAll() throws SQLException {
        var resultSet = DBConnection.statement.executeQuery(String.format("SELECT * FROM basket"));
        var result = new ArrayList<BasketEntity>(0);
        while (resultSet.next())
        {
            var basket = new BasketEntity();
            basket.id = resultSet.getInt("id");
            basket.total_price = resultSet.getDouble("total_price");
            result.add(basket);
        }
        return result;
    }
}
