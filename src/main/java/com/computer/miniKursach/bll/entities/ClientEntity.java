package com.computer.miniKursach.bll.entities;

public class ClientEntity {
    public int id;
    public String name;
    public String phone_number;

    public ClientEntity(int id, String name, String phone_number) {
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
    }

    public ClientEntity() {
    }
}
