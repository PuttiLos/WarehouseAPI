package com.puttimait.WarehouseApi.DTO;

import com.puttimait.WarehouseApi.data.TransactionItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionDTO {

    private long id ;
    private String buyerName = "";
    private Date date = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
