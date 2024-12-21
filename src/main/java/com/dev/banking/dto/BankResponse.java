package com.dev.banking.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankResponse {
    @Schema(
            name = "Bank Response Code"
    )
    private String responseCode;
    @Schema(
            name = "Bank Response Message"
    )
    private String responseMessage;
    @Schema(
            name = "User Account Info(Account number,name and balance)"
    )
    private AccountInfo accountInfo;
}
