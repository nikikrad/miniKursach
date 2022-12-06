package com.computer.miniKursach.dal.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "computer")
public class ComputerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @Column(name = "ram")
    public String ram;
    @Column(name = "hdd")
    public String hdd;
    @Column(name = "ssd")
    public String ssd;
    @Column(name = "matherboard")
    public String matherboard;
    @Column(name = "power_unit")
    public String power_unit;
    @Column(name = "system_unit")
    public String system_unit;
    @Column(name = "video_card")
    public String video_card;
    @Column(name = "price")
    public Double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "computer_has_basket",
            joinColumns = { @JoinColumn(name = "computer_id") },
            inverseJoinColumns = { @JoinColumn(name = "basket_id") }
    )
    private List<BasketEntity> basket = new ArrayList<>();
}
