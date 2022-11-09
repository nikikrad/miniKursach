package com.computer.miniKursach.web.models.computer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.Optional;

@Data
public class PostComputerRequest {
    @JsonProperty("ram")
    public String ram;
//    public Optional getRam() {
//        return Optional.ofNullable(ram);
//    }
//    public void setRam(Optional<String> ram) {
//        this.ram = ram;
//    }
    @JsonProperty("hdd")
    public String hdd;
//    public Optional getHDD() {
//        return Optional.ofNullable(hdd);
//    }
//    public void setHDD(LocalDate hdd) {
//        this.hdd = hdd;
//    }
    @JsonProperty("ssd")
    public String ssd;
//    public Optional getSSD() {
//        return Optional.ofNullable(ssd);
//    }
//    public void setSSD(LocalDate ssd) {
//        this.ssd = ssd;
//    }
    @JsonProperty("matherboard")
    public String matherboard;
//    public Optional getMatherboard() {
//        return Optional.ofNullable(matherboard);
//    }
//    public void setMatherboard(LocalDate matherboard) {
//        this.matherboard = matherboard;
//    }
    @JsonProperty("power_unit")
    public String power_unit;
//    public Optional getPowerUnit() {
//        return Optional.ofNullable(power_unit);
//    }
//    public void setPowerUnit(LocalDate power_unit) {
//        this.power_unit = power_unit;
//    }
    @JsonProperty("system_unit")
    public String system_unit;
//    public Optional getSystemUnit() {
//        return Optional.ofNullable(system_unit);
//    }
//    public void setSystemUnit(LocalDate system_unit) {
//        this.system_unit = system_unit;
//    }
    @JsonProperty("video_card")
    public String video_card;
//    public Optional getVideoCard() {
//        return Optional.ofNullable(video_card);
//    }
//    public void setVideoCard(LocalDate video_card) {
//        this.video_card = video_card;
//    }
    @JsonProperty("price")
    public Double price;
}
