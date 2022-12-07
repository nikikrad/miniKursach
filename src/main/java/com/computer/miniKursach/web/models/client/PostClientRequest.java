package com.computer.miniKursach.web.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostClientRequest {
    @JsonProperty("name")
    public String name;
    @JsonProperty("phone_number")
    public String phone_number;
    @JsonProperty("price")
    public Double price;
    @JsonProperty("basket_id")
    public int basketId;

    public PostClientRequest(int id, String name, String phone_number, Double total_price, int i) {
        this.name = name;
        this.phone_number = phone_number;
        this.price = total_price;
        this.basketId = i;
    }
//    public BasketModelForPostClientRequest basket ;
}
