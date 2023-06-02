package com.puttimait.WarehouseApi.DTO;

public class TransactionRes {
    private String status ="";

    public TransactionRes(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
