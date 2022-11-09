package com.computer.miniKursach.bll.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "computer")
public class ComputerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    @Column(name = "ram")
    public String ram;

//    public Optional getRam() {
//        return Optional.ofNullable(ram);
//    }
//    public void setRam(LocalDate ram) {
//        this.ram = ram;
//    }
    @Column(name = "hdd")
    public String hdd;
//    public Optional getHDD() {
//        return Optional.ofNullable(hdd);
//    }
//    public void setHDD(LocalDate hdd) {
//        this.hdd = hdd;
//    }
    @Column(name = "ssd")
    public String ssd;
//    public Optional getSSD() {
//        return Optional.ofNullable(ssd);
//    }
//    public void setSSD(LocalDate ssd) {
//        this.ssd = ssd;
//    }
    @Column(name = "matherboard")
    public String matherboard;
//    public Optional getMatherboard() {
//        return Optional.ofNullable(matherboard);
//    }
//    public void setMatherboard(LocalDate matherboard) {
//        this.matherboard = matherboard;
//    }
    @Column(name = "power_unit")
    public String power_unit;
//    public Optional getPowerUnit() {
//        return Optional.ofNullable(power_unit);
//    }
//    public void setPowerUnit(LocalDate power_unit) {
//        this.power_unit = power_unit;
//    }
    @Column(name = "system_unit")
    public String system_unit;
//    public Optional getSystemUnit() {
//        return Optional.ofNullable(system_unit);
//    }
//    public void setSystemUnit(LocalDate system_unit) {
//        this.system_unit = system_unit;
//    }
    @Column(name = "video_card")
    public String video_card;
//    public Optional getVideoCard() {
//        return Optional.ofNullable(video_card);
//    }
//    public void setVideoCard(LocalDate video_card) {
//        this.video_card = video_card;
//    }
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
