package com.computer.miniKursach.web.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PostClientRequest {
    @JsonProperty("name")
    public String name;
    @JsonProperty("phone_number")
    public String phone_number;
    @JsonProperty("basket_id")
    public int basketId;
//    public BasketModelForPostClientRequest basket ;
}
