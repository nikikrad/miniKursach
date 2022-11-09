package com.computer.miniKursach.web.models.accessories;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostAccessoriesRequest {

    @JsonProperty("name_device")
    private String name_device;
    @JsonProperty("groupy")
    private String groupy;
    @JsonProperty("price")
    private double price;
}
