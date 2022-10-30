package com.computer.miniKursach.bll.entities;

public class BasketEntity {
    public int id;
    public Double total_price;

    public BasketEntity(int id, Double total_price){
        this.id = id;
        this.total_price = total_price;
    }
    public BasketEntity(){

    }
}
