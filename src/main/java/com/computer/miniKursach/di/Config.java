package com.computer.miniKursach.di;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IDevicesRepository;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.abstractions.services.IDevicesService;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.javalang.injection")
public class Config {
    public IComputerRepository computerRepository;
    public IComputerService computerService;
    public IDevicesRepository devicesRepository;
    public IDevicesService devicesService;
}
