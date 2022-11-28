package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;
@JsonPropertyOrder({
        "DATETIMEISSUED",
        "RECEIPTNUMBER",
        "UUID",
        "PREVIOUSUUID",
        "REFERENCEOLDUUID",
        "CURRENCY",
        "EXCHANGERATE",
        "SORDERNAMECODE",
        "ORDERDELIVERYMODE",
        "GROSSWEIGHT",
        "NETWEIGHT"
})
public class Header {
    @JsonProperty("DATETIMEISSUED")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String dateTimeIssued;

    @JsonProperty("RECEIPTNUMBER")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String receiptNumber;

    @JsonProperty("UUID")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String uuid;

    @JsonProperty("PREVIOUSUUID")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String previousUUID;

    @JsonProperty("REFERENCEOLDUUID")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String referenceOldUUID;

    @JsonProperty("CURRENCY")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String currency="EGP";

    @JsonProperty("EXCHANGERATE")
    //@JsonFormat(shape = JsonFormat.Shape.STRING)
    public double exchangeRate= 0.0;

    @JsonProperty("SORDERNAMECODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String sOrderNameCode="";

    @JsonProperty("ORDERDELIVERYMODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String orderdeliveryMode= "FC";

    @JsonProperty("GROSSWEIGHT")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double grossWeight= 0.0;

    @JsonProperty("NETWEIGHT")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double netWeight= 0.0;

    public Header(String dateTimeIssued, String receiptNumber, String uuid, String previousUUID, String referenceOldUUID) {
        this.dateTimeIssued = dateTimeIssued;
        this.receiptNumber = receiptNumber;
        this.uuid = uuid;
        this.previousUUID = previousUUID;
        this.referenceOldUUID = referenceOldUUID;
    }
}
