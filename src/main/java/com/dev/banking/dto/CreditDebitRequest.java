package com.dev.banking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditDebitRequest {
    @Schema(
            name = "CreditOrDebit Account Number"
    )
    private String accountNumber;
    @Schema(
            name = "CreditOrDebit Amount"
    )
    private BigDecimal amount;
}
