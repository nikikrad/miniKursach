package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.models.accessories_service.GetAccessories;
import com.computer.miniKursach.web.models.accessories.PostAccessoriesRequest;
import com.computer.miniKursach.web.models.accessories.PutAccessoriesRequest;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IAccessoriesService {
    ArrayList<GetAccessories> getAccessories();
    void create(PostAccessoriesRequest createClient);
    void update(PutAccessoriesRequest entity) throws SQLException;
    void delete(int id) throws SQLException;

}
