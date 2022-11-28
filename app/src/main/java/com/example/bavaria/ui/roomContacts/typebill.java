package com.example.bavaria.ui.roomContacts;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "typebill", indices = @Index(value = {"LastUUID"}, unique = true))

public class typebill {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "LastUUID")
    String LastUUID;

    @ColumnInfo(name = "typebill")
    String typebill;

    @ColumnInfo(name = "internalCode")
    String internalCode;

    @ColumnInfo(name = "tax")
    double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @ColumnInfo(name = "description")
    String description;

    @ColumnInfo(name = "itemType")
    String itemType;

    @ColumnInfo(name = "itemCode")
    String itemCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastUUID() {
        return LastUUID;
    }

    public void setLastUUID(String lastUUID) {
        LastUUID = lastUUID;
    }

    public String getTypebill() {
        return typebill;
    }

    public void setTypebill(String typebill) {
        this.typebill = typebill;
    }
}
