package com.computer.miniKursach.web.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeleteRequest {
    @JsonProperty("id")
    public int id;
}
