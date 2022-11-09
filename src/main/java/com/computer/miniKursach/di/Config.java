package com.computer.miniKursach.di;

import com.computer.miniKursach.bll.abstractions.repositories.IBasketRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IClientRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.repositories.IDevicesRepository;
import com.computer.miniKursach.bll.abstractions.services.IBasketService;
import com.computer.miniKursach.bll.abstractions.services.IClientService;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import com.computer.miniKursach.bll.abstractions.services.IAccessoriesService;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.javalang.injection")
public class Config {
    public IComputerRepository computerRepository;
    public IComputerService computerService;
    public IDevicesRepository devicesRepository;
    public IAccessoriesService devicesService;
    public IBasketRepository basketRepository;
    public IBasketService basketService;
    public IClientService clientService;
    public IClientRepository clientRepository;
}
