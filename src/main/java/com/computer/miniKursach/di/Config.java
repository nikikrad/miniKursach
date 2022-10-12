package com.computer.miniKursach.di;

import com.computer.miniKursach.bll.abstractions.repositories.IComputerRepository;
import com.computer.miniKursach.bll.abstractions.services.IComputerService;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.javalang.injection")
public class Config {
    public IComputerRepository computerRepository;
    public IComputerService computerService;
}
