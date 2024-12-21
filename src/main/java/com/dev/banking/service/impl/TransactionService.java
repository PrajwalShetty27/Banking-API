package com.dev.banking.service.impl;

import com.dev.banking.dto.TransactionDto;
import com.dev.banking.model.Transaction;
import org.springframework.data.domain.Page;

public interface TransactionService {
    void savedTransaction(TransactionDto transaction);
    Page<Transaction> getTransactions(int page,int size,String sortBy, String direction);
}
