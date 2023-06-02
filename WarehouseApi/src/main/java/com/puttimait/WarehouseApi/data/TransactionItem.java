package com.puttimait.WarehouseApi.data;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACTION_ITEM")
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ITEM_ID")
    private long id;
    @Column(name = "ITEM_NO")
    private long itemNo;
    @Column(name = "ITEM_ID")
    private long itemId;
    @Column(name = "ITEM_NAME")
    private String itemName;
    @Column(name = "ITEM_QUANTITY")
    private long itemQuantity;
    @Column(name = "ITEM_PRICE_PER_UNIT")
    private long itemPricePerUnit;
    @Column(name = "TRANSACTION_ID")
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

    @Override
    public String toString() {
        return "TransactionItem{" +
                "id=" + id +
                ", itemNo=" + itemNo +
                ", itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", itemPricePerUnit=" + itemPricePerUnit +
                ", transactionId=" + transactionId +
                '}';
    }
}
