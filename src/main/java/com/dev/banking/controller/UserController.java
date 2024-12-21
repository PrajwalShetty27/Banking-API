package com.dev.banking.controller;

import com.dev.banking.dto.*;
import com.dev.banking.service.impl.UserServiceImpl;
import com.dev.banking.utils.AccountUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management APIs")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new User Account and notified with Congratulation Email"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http status 201 CREATED"
    )
    public ResponseEntity<BankResponse> createAccount(@RequestBody UserRequest request) {
        BankResponse account = userService.createAccount(request);
        if (account.getAccountInfo() == null) {
            return new ResponseEntity<>(account, NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>(account, CREATED);
    }

    @GetMapping("/balanceEnquiry")
    @Operation(
            summary = "Balance Enquiry",
            description = "Gets User Account balance Using Account Number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    public ResponseEntity<BankResponse> balanceEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        BankResponse response = userService.balanceEnquiry(enquiryRequest);
        if (response.getAccountInfo() == null) {
            return new ResponseEntity<>(response, NOT_FOUND);
        }
        return new ResponseEntity<>(response, FOUND);
    }

    @GetMapping("/nameEnquiry")
    @Operation(
            summary = "Name Enquiry",
            description = "Gets User Account Name Using Account Number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    public ResponseEntity<String> nameEnquiry(@RequestBody EnquiryRequest enquiryRequest) {
        String name = userService.nameEnquiry(enquiryRequest);
        if (name.equalsIgnoreCase(AccountUtils.ACCOUNT_NOT_EXISTS_MESSAGE)) {
            return new ResponseEntity<>(name, NOT_FOUND);
        }
        return new ResponseEntity<>(name, FOUND);
    }

    @PostMapping("/credit")
    @Operation(
            summary = "Amount Credit",
            description = "Amount Credited to specified Account Number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    public BankResponse creditAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.creditAccount(creditDebitRequest);
    }

    @PostMapping("/debit")
    @Operation(
            summary = "Amount Debit",
            description = "Amount Debited to specified Account Number"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    public BankResponse debitAccount(@RequestBody CreditDebitRequest creditDebitRequest) {
        return userService.debitAccount(creditDebitRequest);
    }

    @PostMapping("/transfer")
    @Operation(
            summary = "Amount transfer",
            description = "Amount Transferred from source account to destination account"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http status 200 SUCCESS"
    )
    public BankResponse transferAmount(@RequestBody TransferRequest transferRequest) {
        return userService.transfer(transferRequest);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);
    }
}
