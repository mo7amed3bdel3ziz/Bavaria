package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "AMOUNT",
        "RATE"
})
public class Beneficiary {
    @JsonProperty("AMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount= 0.0;

    @JsonProperty("RATE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double rate= 0.0;
}
