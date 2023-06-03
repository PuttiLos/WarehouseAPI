package com.puttimait.WarehouseApi.BIZ;

import com.puttimait.WarehouseApi.DTO.TransactionDTO;
import com.puttimait.WarehouseApi.DTO.TransactionItemDTO;
import com.puttimait.WarehouseApi.DTO.TransactionReq;
import com.puttimait.WarehouseApi.DTO.TransactionRes;
import com.puttimait.WarehouseApi.data.Transaction;
import com.puttimait.WarehouseApi.data.TransactionItem;
import com.puttimait.WarehouseApi.data.TransactionItemRepository;
import com.puttimait.WarehouseApi.data.TransactionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionBiz {
    private final TransactionRepository transactionRepository;
    private final TransactionItemRepository transactionItemRepository;

    public TransactionBiz(TransactionRepository transactionRepository, TransactionItemRepository transactionItemRepository) {
        this.transactionRepository = transactionRepository;
        this.transactionItemRepository = transactionItemRepository;
    }
    public TransactionRes addNewTransaction(TransactionReq newTransaction){
        try{
            Transaction newRecord = this.transactionRepository.save(new ModelMapper().map(newTransaction.getTransactionHeader(),Transaction.class));

            newTransaction.getTransactionItems().forEach(item -> {
                TransactionItem newItem = new ModelMapper().map(item, TransactionItem.class);
                newItem.setTransactionId(newRecord.getId());
                this.transactionItemRepository.save(newItem);
            });
        }
        catch (Exception e){
            return new TransactionRes(e.getLocalizedMessage());
        }
        return new TransactionRes("Success!");


    }
    public TransactionReq getTransactionByTransactionId(long id){
        Optional<Transaction> transaction = this.transactionRepository.findById(id);
        TransactionDTO transactionHeader = new ModelMapper().map(transaction.get(), TransactionDTO.class);
        List<TransactionItem> items = this.transactionItemRepository.getTransactionItemsByTransactionId(id);
        List<TransactionItemDTO> transactionItems = new ArrayList<>();
        items.forEach(item -> {
            transactionItems.add(new ModelMapper().map(item, TransactionItemDTO.class));
        });
        TransactionReq result = new TransactionReq();
        result.setTransactionHeader(transactionHeader);
        result.setTransactionItems(transactionItems);
        return result;
    }
}
