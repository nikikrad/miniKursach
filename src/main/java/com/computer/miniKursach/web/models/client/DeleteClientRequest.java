package com.computer.miniKursach.web.models.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeleteClientRequest {
    @JsonProperty("id")
    public int id;
}
