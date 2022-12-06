package com.computer.miniKursach.web.models.basket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetBasketRequest {
    @JsonProperty("id")
    public int id;
}
