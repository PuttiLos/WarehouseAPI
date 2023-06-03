package com.puttimait.WarehouseApi.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private long id;
    @Column(name = "BUYER_NAME")
    private String buyerName;
    @Column(name = "TRANSACTION_DATE")
    private Date date;


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

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", buyerName='" + buyerName + '\'' +
                ", date=" + date +
                '}';
    }
}
