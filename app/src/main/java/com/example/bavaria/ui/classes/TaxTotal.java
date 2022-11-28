package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "TAXTOTALS",
        "TAXTYPE",
        "AMOUNT"
})
public class TaxTotal {
    @JsonProperty("TAXTYPE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String taxType="T1";

    @JsonProperty("AMOUNT")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount;

    @JsonProperty("TAXTOTALS")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxTotal;

    public TaxTotal(double amount) {
        this.amount = amount;
    }
}
