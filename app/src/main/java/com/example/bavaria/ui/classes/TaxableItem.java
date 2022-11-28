package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "TAXABLEITEMS",
        "TAXTYPE",
        "AMOUNT",
        "SUBTYPE",
        "RATE"
})
public class TaxableItem {
    @JsonProperty("TAXTYPE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String taxType="T1";

    @JsonProperty("AMOUNT")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount=7.0;

    @JsonProperty("SUBTYPE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String subType="V009";

    @JsonProperty("RATE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double rate=14.0;

    @JsonProperty("TAXABLEITEMS")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String taxableType;
}
