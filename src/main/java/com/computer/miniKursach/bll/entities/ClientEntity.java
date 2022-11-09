package com.computer.miniKursach.bll.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone_number")
    public String phone_number;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="basket_id", nullable=false)
    public BasketEntity basket;

}
