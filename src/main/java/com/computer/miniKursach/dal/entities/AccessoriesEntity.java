package com.computer.miniKursach.dal.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "accessories")
public class AccessoriesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name_device")
    private String name_device;
    @Column(name = "groupy")
    private String groupy;
    @Column(name = "price")
    private double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "accessories_has_basket",
            joinColumns = { @JoinColumn(name = "accessories_id") },
            inverseJoinColumns = { @JoinColumn(name = "basket_id") }
    )
    private List<BasketEntity> basket = new ArrayList<>();


}
