package com.puttimait.WarehouseApi.Controller;


import com.puttimait.WarehouseApi.BIZ.TransactionBiz;
import com.puttimait.WarehouseApi.DTO.TransactionReq;
import com.puttimait.WarehouseApi.DTO.TransactionRes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    private final TransactionBiz transactionBiz;

    public TransactionController(TransactionBiz transactionBiz) {
        this.transactionBiz = transactionBiz;
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public TransactionRes addNewTransaction(@RequestBody TransactionReq transactionReq){
        return this.transactionBiz.addNewTransaction(transactionReq);
    }
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public TransactionReq getTransactionByTransactionId(@RequestParam(value = "id", required = true) long transactionId){
        return this.transactionBiz.getTransactionByTransactionId(transactionId);
    }
}
