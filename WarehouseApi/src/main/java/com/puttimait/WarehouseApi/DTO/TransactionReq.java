package com.puttimait.WarehouseApi.DTO;

import java.util.List;

public class TransactionReq {
    private TransactionDTO transactionHeader;
    private List<TransactionItemDTO> transactionItems;

    public TransactionDTO getTransactionHeader() {
        return transactionHeader;
    }

    public void setTransactionHeader(TransactionDTO transactionHeader) {
        this.transactionHeader = transactionHeader;
    }

    public List<TransactionItemDTO> getTransactionItems() {
        return transactionItems;
    }

    public void setTransactionItems(List<TransactionItemDTO> transactionItems) {
        this.transactionItems = transactionItems;
    }
}
