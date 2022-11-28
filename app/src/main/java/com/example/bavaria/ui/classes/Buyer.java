package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "TYPE",
        "ID",
        "NAME",
        "MOBILENUMBER",
        "PAYMENTNUMBER",
})
public class Buyer {
    @JsonProperty("TYPE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String type;

    @JsonProperty("ID") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String id;

    @JsonProperty("NAME") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String name;

    @JsonProperty("MOBILENUMBER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String mobileNumber;

    @JsonProperty("PAYMENTNUMBER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String paymentNumber;

    public Buyer(String type, String id, String name, String mobileNumber, String paymentNumber) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.paymentNumber = paymentNumber;
    }
}
