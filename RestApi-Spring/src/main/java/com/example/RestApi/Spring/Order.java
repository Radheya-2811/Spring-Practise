package com.example.RestApi.Spring;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    @JsonProperty("cname")
    private String custName;

    @JsonProperty("pname")
    private String prodName;

    private int quantity;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "custName='" + custName + '\'' +
                ", prodName='" + prodName + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
