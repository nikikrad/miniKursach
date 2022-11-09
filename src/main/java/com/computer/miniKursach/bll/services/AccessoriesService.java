package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.services.IAccessoriesService;
import com.computer.miniKursach.bll.entities.AccessoriesEntity;
import com.computer.miniKursach.bll.entities.ComputerEntity;
import com.computer.miniKursach.dal.repositories.AccessoriesRepository;
import com.computer.miniKursach.web.models.accessories.PostAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PutAccessoriesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AccessoriesService implements IAccessoriesService {

    @Autowired
    public AccessoriesRepository accessoriesRepository;

    @Override
    public List<AccessoriesEntity> getAccessories() {
        var accessoriesList = accessoriesRepository.findAll();
        return accessoriesList;
    }

    @Override
    public void create(PostAccessoriesRequest createAccessories) {
        var accessoriesEntity = new AccessoriesEntity();
        accessoriesEntity.setName_device(createAccessories.getName_device());
        accessoriesEntity.setGroupy(createAccessories.getGroupy());
        accessoriesEntity.setPrice(createAccessories.getPrice());
        accessoriesRepository.save(accessoriesEntity);
    }

    @Override
    public void update(PutAccessoriesRequest entity) throws SQLException {
        var accessoriesEntity = new AccessoriesEntity();
        accessoriesEntity.setId(entity.getId());
        accessoriesEntity.setName_device(entity.getName_device());
        accessoriesEntity.setGroupy(entity.getGroupy());
        accessoriesEntity.setPrice(entity.getPrice());
        accessoriesRepository.save(accessoriesEntity);
    }

    @Override
    public void delete(int id) throws SQLException {
        var accessories = accessoriesRepository.findById(id);
        if (!accessories.isEmpty())
            accessoriesRepository.delete(accessories.get());
    }
}
