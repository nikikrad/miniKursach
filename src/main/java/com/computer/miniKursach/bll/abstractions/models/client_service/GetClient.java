package com.computer.miniKursach.bll.abstractions.models.client_service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetClient {
    public int id;
    public String name;
    public String phone_number;
    public int basket_id;

    public GetClient( int id, String name, String phone_number){
        this.id = id;
        this.name = name;
        this.phone_number = phone_number;
        this.basket_id = id;
    }
}
