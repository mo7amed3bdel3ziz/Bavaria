package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "COUNTRY",
        "GOVERNATE",
        "REGIONCITY",
        "STREET",
        "BUILDINGNUMBER",
        "POSTALCODE",
        "FLOOR",
        "ROOM",
        "LANDMARK",
        "ADDITIONALINFORMATION"
})
public class BranchAddress {
    @JsonProperty("COUNTRY") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String country;

    @JsonProperty("GOVERNATE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String governate;

    @JsonProperty("REGIONCITY") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String regionCity;

    @JsonProperty("STREET") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String street;

    @JsonProperty("BUILDINGNUMBER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String buildingNumber;

    @JsonProperty("POSTALCODE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String postalCode;

    @JsonProperty("FLOOR") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String floor;

    @JsonProperty("ROOM") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String room;

    @JsonProperty("LANDMARK") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String landmark;

    @JsonProperty("ADDITIONALINFORMATION") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String additionalInformation;

    public BranchAddress(String country, String governate, String regionCity, String street, String buildingNumber, String postalCode, String floor, String room, String landmark, String additionalInformation) {
        this.country = country;
        this.governate = governate;
        this.regionCity = regionCity;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.floor = floor;
        this.room = room;
        this.landmark = landmark;
        this.additionalInformation = additionalInformation;
    }
}
