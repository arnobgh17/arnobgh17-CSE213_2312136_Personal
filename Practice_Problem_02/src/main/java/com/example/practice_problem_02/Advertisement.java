package com.example.practice_problem_02;

import java.time.LocalDate;

public class Advertisement {
//    advId, advType, clientId, billAmount, vatPercent, isForCharity, deliveryDate
//    advType: Print, Audio, Video, BillBoard, etc.

    private String advID, advType, clientID;
    private Float billAmount;
    private Integer vatPercent;
    private LocalDate delivaeryDate;
    private Boolean isForCharity;

    public Advertisement(String advID, String advType, String clientID, Float billAmount, Integer vatPercent, LocalDate delivaeryDate, Boolean isForCharity) {
        this.advID = advID;
        this.advType = advType;
        this.clientID = clientID;
        this.billAmount = billAmount;
        this.vatPercent = vatPercent;
        this.delivaeryDate = delivaeryDate;
        this.isForCharity = isForCharity;
    }

    public void setBillAmount(Float billAmount) {
        this.billAmount = billAmount;
    }

    public void setVatPercent(Integer vatPercent) {
        this.vatPercent = vatPercent;
    }

    public String getAdvID() {
        return advID;
    }

    public String getAdvType() {
        return advType;
    }

    public String getClientID() {
        return clientID;
    }

    public Float getBillAmount() {
        return billAmount;
    }

    public Integer getVatPercent() {
        return vatPercent;
    }

    public LocalDate getDelivaeryDate() {
        return delivaeryDate;
    }

    public Boolean getForCharity() {
        return isForCharity;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "advID='" + advID + '\'' +
                ", advType='" + advType + '\'' +
                ", clientID='" + clientID + '\'' +
                ", billAmount=" + billAmount +
                ", vatPercent=" + vatPercent +
                ", delivaeryDate=" + delivaeryDate +
                ", isForCharity=" + isForCharity +
                '}';
    }

    public void showTotalAmountInAlert(){}
//
}
