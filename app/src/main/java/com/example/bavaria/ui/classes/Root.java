package com.example.bavaria.ui.classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;

@JsonPropertyOrder({
        "HEADER",
        "DOCUMENTTYPE",
        "SELLER",
        "BUYER",
        "ITEMDATA",
        "TOTALSALES",
        "TOTALCOMMERCIALDISCOUNT",
        "TOTALITEMSDISCOUNT",
        "EXTRARECEIPTDISCOUNTDATA",
        "NETAMOUNT",
        "FEESAMOUNT",
        "TOTALAMOUNT",
        "TAXTOTALS",
        "PAYMENTMETHOD",
        "ADJUSTMENT",
        "CONTRACTOR",
        "BENEFICIARY"
})
public class Root {
    @JsonProperty("HEADER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Header header;

    @JsonProperty("DOCUMENTTYPE") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public DocumentType documentType;

    @JsonProperty("SELLER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Seller seller;

    @JsonProperty("BUYER") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Buyer buyer;

    @JsonProperty("ITEMDATA") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<ItemDatum> itemData;

    @JsonProperty("TOTALSALES") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double totalSales;

    @JsonProperty("TOTALCOMMERCIALDISCOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double totalCommercialDiscount;

    @JsonProperty("TOTALITEMSDISCOUNT")
    //@JsonFormat(shape = JsonFormat.Shape.STRING)
    public double totalItemsDiscount;

    @JsonProperty("EXTRARECEIPTDISCOUNTDATA") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<ExtraReceiptDiscountDatum> extraReceiptDiscountData;

    @JsonProperty("NETAMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double netAmount;

    @JsonProperty("FEESAMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public int feesAmount;

    @JsonProperty("TOTALAMOUNT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public double totalAmount;

    @JsonProperty("TAXTOTALS") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public ArrayList<TaxTotal> taxTotals;

    @JsonProperty("PAYMENTMETHOD") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public String paymentMethod="C";

    @JsonProperty("ADJUSTMENT") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public int adjustment=0;

    @JsonProperty("CONTRACTOR") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Contractor contractor;

    @JsonProperty("BENEFICIARY") @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Beneficiary beneficiary;


    public Root(Header header, DocumentType documentType, Seller seller, Buyer buyer, ArrayList<ItemDatum> itemData, double totalSales, double totalCommercialDiscount, double totalItemsDiscount, ArrayList<ExtraReceiptDiscountDatum> extraReceiptDiscountData, double netAmount, int feesAmount, double totalAmount, ArrayList<TaxTotal> taxTotals, String paymentMethod, int adjustment, Contractor contractor, Beneficiary beneficiary) {
        this.header = header;
        this.documentType = documentType;
        this.seller = seller;
        this.buyer = buyer;
        this.itemData = itemData;
        this.totalSales = totalSales;
        this.totalCommercialDiscount = totalCommercialDiscount;
        this.totalItemsDiscount = totalItemsDiscount;
        this.extraReceiptDiscountData = extraReceiptDiscountData;
        this.netAmount = netAmount;
        this.feesAmount = feesAmount;
        this.totalAmount = totalAmount;
        this.taxTotals = taxTotals;
        this.paymentMethod = paymentMethod;
        this.adjustment = adjustment;
        this.contractor = contractor;
        this.beneficiary = beneficiary;
    }
}
