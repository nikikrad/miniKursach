package com.computer.miniKursach.web.models.computer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeleteComputerRequest {
    @JsonProperty("id")
    public int id;
}
