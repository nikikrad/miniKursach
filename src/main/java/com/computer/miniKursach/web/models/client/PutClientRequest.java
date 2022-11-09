package com.computer.miniKursach.web.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PutClientRequest {
    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("phone_number")
    public String phone_number;
    @JsonProperty("basket_id")
    public int basketId;
}
