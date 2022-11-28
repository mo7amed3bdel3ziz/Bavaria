package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "COMMERCIALDISCOUNTDATA",
        "AMOUNT",
        "DESCRIPTION"
})
public class CommercialDiscountDatum {
    @JsonProperty("AMOUNT")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount= 0.0;

    @JsonProperty("DESCRIPTION")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String description="itmdiscount";

    @JsonProperty("COMMERCIALDISCOUNTDATA")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String comercialData;
}
