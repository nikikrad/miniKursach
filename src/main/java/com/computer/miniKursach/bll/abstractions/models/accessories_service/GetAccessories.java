package com.computer.miniKursach.bll.abstractions.models.accessories_service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetAccessories {
    private int id;
    private String name_device;
    private String groupy;
    private double price;
}
