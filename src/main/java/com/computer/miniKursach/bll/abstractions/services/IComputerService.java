package com.computer.miniKursach.bll.abstractions.services;

import com.computer.miniKursach.bll.models.computer_service.GetComputer;
import com.computer.miniKursach.dal.entities.ComputerEntity;
import com.computer.miniKursach.web.models.computer.PostComputerRequest;
import com.computer.miniKursach.web.models.computer.PutComputerRequest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IComputerService {
    ArrayList<GetComputer> getComputer();

    void create(PostComputerRequest createComputer);

    void update(PutComputerRequest entity) throws SQLException;

    void delete(int id) throws SQLException;

}
