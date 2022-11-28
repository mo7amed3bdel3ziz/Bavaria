package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "EXTRARECEIPTDISCOUNTDATA",
        "AMOUNT",
        "DESCRIPTION"
})
public class ExtraReceiptDiscountDatum {
    @JsonProperty("AMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double amount=0.0;

    @JsonProperty("DESCRIPTION") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String description="itmdiscount";

    @JsonProperty("EXTRARECEIPTDISCOUNTDATA") @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String extraReceipt;
}
