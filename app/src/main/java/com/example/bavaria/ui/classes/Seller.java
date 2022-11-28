package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "RIN",
        "COMPANYTRADENAME",
        "BRANCHCODE",
        "BRANCHADDRESS",
        "DEVICESERIALNUMBER",
        "SYNDICATELICENSENUMBER",
        "ACTIVITYCODE"
})
public class Seller {
    @JsonProperty("RIN")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String rin;

    @JsonProperty("COMPANYTRADENAME")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String companyTradeName;

    @JsonProperty("BRANCHCODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String branchCode;

    @JsonProperty("BRANCHADDRESS")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public BranchAddress branchAddress;

    @JsonProperty("DEVICESERIALNUMBER")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String deviceSerialNumber;

    @JsonProperty("SYNDICATELICENSENUMBER")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String syndicateLicenseNumber;

    @JsonProperty("ACTIVITYCODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String activityCode;

    public Seller(String rin, String companyTradeName, String branchCode, BranchAddress branchAddress, String deviceSerialNumber, String syndicateLicenseNumber, String activityCode) {
        this.rin = rin;
        this.companyTradeName = companyTradeName;
        this.branchCode = branchCode;
        this.branchAddress = branchAddress;
        this.deviceSerialNumber = deviceSerialNumber;
        this.syndicateLicenseNumber = syndicateLicenseNumber;
        this.activityCode = activityCode;
    }
}
