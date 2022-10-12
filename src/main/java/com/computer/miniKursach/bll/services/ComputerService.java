package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class ComputerService implements IComputerService {

    private IComputerRepository computerRepository;
    public ComputerService(IComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }
    public void create(ComputerEntity entity) throws SQLException {
        computerRepository.create(entity);
    }
    public void update(ComputerEntity entity) throws SQLException {
        computerRepository.update(entity);
    }
    public void delete(int id) throws SQLException {
        computerRepository.delete(id);
    }
    public ArrayList<ComputerEntity> getAll() throws SQLException {
       return computerRepository.getAll();
    }
}
