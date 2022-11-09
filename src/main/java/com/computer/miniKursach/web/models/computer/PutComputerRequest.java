package com.computer.miniKursach.web.models.computer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Optional;

@Data
public class PutComputerRequest {
    @JsonProperty("id")
    public int id;
    @JsonProperty("ram")
    public String ram;
    @JsonProperty("hdd")
    public String hdd;
    @JsonProperty("ssd")
    public String ssd;
    @JsonProperty("matherboard")
    public String matherboard;
    @JsonProperty("power_unit")
    public String power_unit;
    @JsonProperty("system_unit")
    public String system_unit;
    @JsonProperty("video_card")
    public String video_card;
    @JsonProperty("price")
    public Double price;
}
