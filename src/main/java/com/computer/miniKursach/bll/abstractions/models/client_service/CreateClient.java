package com.computer.miniKursach.bll.abstractions.models.client_service;

import com.computer.miniKursach.web.models.client.BasketModelForPostClientRequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateClient {
    private String name;
    private String phone_number;
    public BasketModelForPostClientRequest basket;
}
