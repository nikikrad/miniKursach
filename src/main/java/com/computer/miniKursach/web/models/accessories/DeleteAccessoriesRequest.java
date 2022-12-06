package com.computer.miniKursach.web.models.accessories;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DeleteAccessoriesRequest {
    @JsonProperty("id")
    public int id;
}
