package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "NAME",
        "AMOUNT",
        "RATE"
})
public class Contractor {
    @JsonProperty("NAME") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String name="0";

    @JsonProperty("AMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount=0.0;

    @JsonProperty("RATE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double rate=0.0;
}
