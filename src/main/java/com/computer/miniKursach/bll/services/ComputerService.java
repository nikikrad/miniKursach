package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.entities.BasketEntity;
import com.computer.miniKursach.bll.entities.ClientEntity;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.dal.repositories.ComputerRepository;
import com.computer.miniKursach.web.models.computer.PostComputerRequest;
import com.computer.miniKursach.web.models.computer.PutComputerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerService implements IComputerService {

    @Autowired
    private ComputerRepository computerRepository;


    @Override
    public List<ComputerEntity> getComputer() {
        var computerList = computerRepository.findAll();
        return computerList;
    }

    @Override
    public void create(PostComputerRequest createComputer) {
        var computerEntity = new ComputerEntity();
        computerEntity.setRam(createComputer.getRam());
        computerEntity.setHdd(createComputer.getHdd());
        computerEntity.setSsd(createComputer.getSsd());
        computerEntity.setMatherboard(createComputer.getMatherboard());
        computerEntity.setPower_unit(createComputer.getPower_unit());
        computerEntity.setSystem_unit(createComputer.getSystem_unit());
        computerEntity.setVideo_card(createComputer.getVideo_card());
        computerEntity.setPrice(createComputer.getPrice());
        computerRepository.save(computerEntity);
    }

    @Override
    public void update(PutComputerRequest entity) throws SQLException {
        var computerEntity = new ComputerEntity();
        computerEntity.setId(entity.id);
        computerEntity.setRam(entity.getRam());
        computerEntity.setHdd(entity.getHdd());
        computerEntity.setSsd(entity.getSsd());
        computerEntity.setMatherboard(entity.getMatherboard());
        computerEntity.setPower_unit(entity.getPower_unit());
        computerEntity.setSystem_unit(entity.getSystem_unit());
        computerEntity.setVideo_card(entity.getVideo_card());
        computerEntity.setPrice(entity.getPrice());
        computerRepository.save(computerEntity);
    }

    @Override
    public void delete(int id) throws SQLException {
        var computer = computerRepository.findById(id);
        if (!computer.isEmpty())
            computerRepository.delete(computer.get());

    }
//
//    private IComputerRepository computerRepository;
//    public ComputerService(IComputerRepository computerRepository) {
//        this.computerRepository = computerRepository;
//    }
//    public void create(ComputerEntity entity) throws SQLException {
//        computerRepository.create(entity);
//    }
//    public void update(ComputerEntity entity) throws SQLException {
//        computerRepository.update(entity);
//    }
//    public void delete(int id) throws SQLException {
//        computerRepository.delete(id);
//    }
//    public ArrayList<ComputerEntity> getAll() throws SQLException {
//       return computerRepository.getAll();
//    }
}
