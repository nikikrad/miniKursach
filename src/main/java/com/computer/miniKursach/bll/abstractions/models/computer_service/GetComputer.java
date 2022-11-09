package com.computer.miniKursach.bll.abstractions.models.computer_service;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class GetComputer {
    private int id;
    private Optional<String> ram;
    private Optional<String> hdd;
    private Optional<String> ssd;
    private Optional<String> matherboard;
    private Optional<String> power_unit;
    private Optional<String> system_unit;
    private Optional<String> video_card;
    private Double price;
}
