package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
@JsonPropertyOrder({
        "ITEMDATA",
        "INTERNALCODE",
        "DESCRIPTION",
        "ITEMTYPE",
        "ITEMCODE",
        "UNITTYPE",
        "QUANTITY",
        "UNITPRICE",
        "NETSALE",
        "TOTALSALE",
        "TOTAL",
        "COMMERCIALDISCOUNTDATA",
        "ITEMDISCOUNTDATA",
        "VALUEDIFFERENCE",
        "TAXABLEITEMS"
})
public class ItemDatum {
    @JsonProperty("INTERNALCODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String internalCode;

    @JsonProperty("DESCRIPTION")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String description;

    @JsonProperty("ITEMTYPE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String itemType;

    @JsonProperty("ITEMCODE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String itemCode;

    @JsonProperty("UNITTYPE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String unitType;

    @JsonProperty("QUANTITY")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double quantity;

    @JsonProperty("UNITPRICE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double unitPrice;

    @JsonProperty("NETSALE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double netSale;

    @JsonProperty("TOTALSALE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double totalSale;

    @JsonProperty("TOTAL")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double total;

    @JsonProperty("COMMERCIALDISCOUNTDATA")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<CommercialDiscountDatum> commercialDiscountData;

    @JsonProperty("ITEMDISCOUNTDATA")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<ItemDiscountDatum> itemDiscountData;

    @JsonProperty("VALUEDIFFERENCE")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public int valueDifference;

    @JsonProperty("TAXABLEITEMS")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<TaxableItem> taxableItems;

    @JsonProperty("ITEMDATA")  @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String itemdata;

    public ItemDatum(String internalCode, String description,
                     String itemType, String itemCode, String unitType, double quantity,
                     double unitPrice, double netSale, double totalSale, double total,
                     ArrayList<CommercialDiscountDatum> commercialDiscountData,
                     ArrayList<ItemDiscountDatum> itemDiscountData, int valueDifference,
                     ArrayList<TaxableItem> taxableItems) {
        this.internalCode = internalCode;
        this.description = description;
        this.itemType = itemType;
        this.itemCode = itemCode;
        this.unitType = unitType;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.netSale = netSale;
        this.totalSale = totalSale;
        this.total = total;
        this.commercialDiscountData = commercialDiscountData;
        this.itemDiscountData = itemDiscountData;
        this.valueDifference = valueDifference;
        this.taxableItems = taxableItems;

    }
}
