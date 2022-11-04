package com.computer.miniKursach.bll.entities;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class DevicesEntity {
    public int id;
    public String name_device;
    public String groupy;
    public Double price;

    public DevicesEntity(int id, String name_device, String group, Double price) {//, String group, Double price
        this.id = id;
        this.name_device = name_device;
        this.groupy = group;
        this.price = price;
    }

    public DevicesEntity() {
    }
}
