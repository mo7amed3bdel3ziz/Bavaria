package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "RECEIPTTYPE",
        "TYPEVERSION"
})
public class DocumentType {
    @JsonProperty("RECEIPTTYPE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String receiptType;

    @JsonProperty("TYPEVERSION") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String typeVersion;
}
