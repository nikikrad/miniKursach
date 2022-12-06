package com.computer.miniKursach.bll.models.computer_service;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
public class GetComputer {
    private int id;
    private String ram;
    private String hdd;
    private String ssd;
    private String matherboard;
    private String power_unit;
    private String system_unit;
    private String video_card;
    private Double price;
}
