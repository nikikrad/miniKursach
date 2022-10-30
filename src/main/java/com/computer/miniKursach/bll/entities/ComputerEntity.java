package com.computer.miniKursach.bll.entities;

public class ComputerEntity {
    public int id;
    public String ram;
    public String hdd;
    public String ssd;
    public String matherboard;
    public String power_unit;
    public String system_unit;
    public String video_card;
    public Double price;
    public ComputerEntity(int id, String ram, String hdd, String ssd, String matherboard, String power_unit, String system_unit, String video_card, Double price) {
        this.id = id;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.matherboard = matherboard;
        this.power_unit = power_unit;
        this.system_unit = system_unit;
        this.video_card = video_card;
        this.price = price;
    }

    public ComputerEntity() {
    }
}
