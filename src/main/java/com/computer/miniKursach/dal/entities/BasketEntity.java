package com.computer.miniKursach.dal.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "basket")
public class BasketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "total_price")
    public Double total_price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "accessories_has_basket",
            joinColumns = { @JoinColumn(name = "accessories_id") },
            inverseJoinColumns = { @JoinColumn(name = "basket_id") }
    )
    private List<AccessoriesEntity> accessories = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "computer_has_basket",
            joinColumns = { @JoinColumn(name = "computer_id") },
            inverseJoinColumns = { @JoinColumn(name = "basket_id") }
    )
    private List<ComputerEntity> computers = new ArrayList<>();
}
