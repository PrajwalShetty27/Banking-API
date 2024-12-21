package com.dev.banking.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {
    @Schema(
            name = "User first Name"
    )
    private String firstName;
    @Schema(
            name = "User last Name"
    )
    private String lastName;
    @Schema(
            name = "User gender"
    )
    private String gender;
    @Schema(
            name = "User Address"
    )
    private String address;
    @Schema(
            name = "User Living location state/country"
    )
    private String stateOfOrigin;
    //    private String accountNumber;
//    private BigDecimal accountBalance;
    @Schema(
            name = "User email"
    )
    private String email;
    @Schema(
            name = "User Phone Number"
    )
    private String password;
    private String phoneNumber;
    @Schema(
            name = "User Alternative Phone Number"
    )
    private String alternativePhoneNumber;
    @Schema(
            name = "Account status"
    )
    private String status;
}
