package com.computer.miniKursach.bll.services;

import com.computer.miniKursach.bll.abstractions.services.IAccessoriesService;
import com.computer.miniKursach.bll.models.accessories_service.GetAccessories;
import com.computer.miniKursach.dal.entities.AccessoriesEntity;
import com.computer.miniKursach.bll.repositories.AccessoriesRepository;
import com.computer.miniKursach.web.models.accessories.PostAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PutAccessoriesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class AccessoriesService implements IAccessoriesService {

    @Autowired
    public AccessoriesRepository accessoriesRepository;

    @Override
    public ArrayList<GetAccessories> getAccessories() {
        var accessoriesList = accessoriesRepository.findAll();
        var resultList = new ArrayList<GetAccessories>();
        for (var accessory :
                accessoriesList) {
            var newAccessory = new GetAccessories();
            newAccessory.setId(accessory.getId());
            newAccessory.setName_device(accessory.getName_device());
            newAccessory.setGroupy(accessory.getGroupy());
            newAccessory.setPrice(accessory.getPrice());
            resultList.add(newAccessory);
        }
        return resultList;
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
        accessoriesRepository.deleteById(id);
    }
}
