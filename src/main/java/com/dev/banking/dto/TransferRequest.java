package com.dev.banking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransferRequest {
    @Schema(
            name = "Source User Account Number"
    )
    private String accountNumber;
    @Schema(
            name = "Destination User Account Number"
    )
    private String destinationAccountNumber;
    @Schema(
            name = "Amount from source to destination"
    )
    private BigDecimal amount;
}
