package com.computer.miniKursach.web.models.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PutBasketRequest {
    @JsonProperty("id")
    public int id;
    @JsonProperty("total_price")
    public Double total_price;
}
