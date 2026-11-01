package com.example.mockmid_2312136_2;

import java.time.LocalDate;

public class CreditCard {
//     private fields: cardNo (String), holderName, dateOfExpiry, gatewayName (Visa/MasterCard),
//     creditLimit, cardType (silver/gold/platinum/titanium)

    private String cardNo;
    private String holderName;
    private LocalDate dateOfExpiry;
    private String gatewayName;
    private float creditLimit;
    private String cardType;

    public CreditCard(String cardNo, String holderName, LocalDate dateOfExpiry, String gatewayName, float creditLimit, String cardType) {
        this.cardNo = cardNo;
        this.holderName = holderName;
        this.dateOfExpiry = dateOfExpiry;
        this.gatewayName = gatewayName;
        this.creditLimit = creditLimit;
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public String getGatewayName() {
        return gatewayName;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public String getCardType() {
        return cardType;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNo='" + cardNo + '\'' +
                ", holderName='" + holderName + '\'' +
                ", dateOfExpiry=" + dateOfExpiry +
                ", gatewayName='" + gatewayName + '\'' +
                ", creditLimit=" + creditLimit +
                ", cardType='" + cardType + '\'' +
                '}';
    }

    public void showCardInfoToAlert(){

//
    };

}


