package com.puttimait.WarehouseApi.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionItemRepository extends CrudRepository<TransactionItem, Long> {
    public List<TransactionItem> getTransactionItemsByTransactionId(long transactionId);
}
