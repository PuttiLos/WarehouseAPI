package com.puttimait.WarehouseApi.DTO;

import javax.persistence.Column;

public class TransactionItemDTO {
    private long id;
    private long itemNo;
    private long itemId;
    private String itemName;
    private long itemQuantity;
    private long itemPricePerUnit;
    private long transactionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemNo() {
        return itemNo;
    }

    public void setItemNo(long itemNo) {
        this.itemNo = itemNo;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public long getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public long getItemPricePerUnit() {
        return itemPricePerUnit;
    }

    public void setItemPricePerUnit(long itemPricePerUnit) {
        this.itemPricePerUnit = itemPricePerUnit;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
}
