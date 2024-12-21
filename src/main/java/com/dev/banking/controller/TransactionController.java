package com.dev.banking.controller;

import com.dev.banking.model.Transaction;
import com.dev.banking.service.impl.BankStatement;
import com.dev.banking.service.impl.TransactionService;
import com.itextpdf.text.DocumentException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@AllArgsConstructor
public class TransactionController {

    private BankStatement bankStatement;

    @Autowired
    TransactionService transactionService;

    @GetMapping("/bankStatement")
    public List<Transaction> generateStatement(@RequestParam String accountNumber,
                                               @RequestParam String startDate, @RequestParam String endDate) throws DocumentException, FileNotFoundException {
        return bankStatement.generateStatement(accountNumber,startDate,endDate);
    }

    @GetMapping("/transactions")
    public Page<Transaction> getTransactions(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "createAt") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        return transactionService.getTransactions(page, size, sortBy, direction);
    }
}
