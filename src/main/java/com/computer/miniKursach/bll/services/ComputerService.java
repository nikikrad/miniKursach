package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.models.computer_service.GetComputer;
import com.computer.miniKursach.dal.entities.ComputerEntity;
import com.computer.miniKursach.bll.repositories.ComputerRepository;
import com.computer.miniKursach.web.models.computer.PostComputerRequest;
import com.computer.miniKursach.web.models.computer.PutComputerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComputerService implements IComputerService {

    @Autowired
    private ComputerRepository computerRepository;


    @Override
    public ArrayList<GetComputer> getComputer() {
        var computerList = computerRepository.findAll();
        var resultList = new ArrayList<GetComputer>();
        for (var computer :
                computerList) {
            var newComputer = new GetComputer();
            newComputer.setId(computer.getId());
            newComputer.setHdd(computer.getHdd());
            newComputer.setMatherboard(computer.getMatherboard());
            newComputer.setRam(computer.getRam());
            newComputer.setSsd(computer.getSsd());
            newComputer.setPower_unit(computer.getPower_unit());
            newComputer.setVideo_card(computer.getVideo_card());
            newComputer.setSystem_unit(computer.getSystem_unit());
            newComputer.setPrice(computer.getPrice());
            resultList.add(newComputer);
        }
        return resultList;
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
        computerRepository.deleteById(id);

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
