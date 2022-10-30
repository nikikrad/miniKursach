package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IDevicesRepository;
import com.computer.miniKursach.bll.abstractions.services.IDevicesService;
import com.computer.miniKursach.bll.entities.DevicesEntity;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class DevicesService implements IDevicesService {

    private IDevicesRepository devicesRepository;
    public DevicesService(IDevicesRepository devicesRepository) {
        this.devicesRepository = devicesRepository;
    }

    @Override
    public void create(DevicesEntity entity) throws SQLException {
        devicesRepository.create(entity);
    }

    @Override
    public void update(DevicesEntity entity) throws SQLException {
        devicesRepository.update(entity);
    }

    @Override
    public void delete(int id) throws SQLException {
        devicesRepository.delete(id);
    }

    @Override
    public ArrayList<DevicesEntity> getAll() throws SQLException {
        return devicesRepository.getAll();
    }
}
