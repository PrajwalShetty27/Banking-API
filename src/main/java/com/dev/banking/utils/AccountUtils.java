package com.dev.banking.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created!";

    public static final String ACCOUNT_CREATION_SUCCESS_CODE = "002";
    public static final String ACCOUNT_CREATION_SUCCESS_MESSAGE = "Account successfully created!";

    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE = "User with this account number does not exists!";

    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_MESSAGE = "User Account found";

    public static final String ACCOUNT_CREDITED_SUCCESS_CODE = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Amount Credited";

    public static final String ACCOUNT_DEBITED_SUCCESS_CODE = "006";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE = "Amount Debited";

    public static final String ACCOUNT_AMOUNT_INSUFFICIENT_CODE = "007";
    public static final String ACCOUNT_AMOUNT_INSUFFICIENT_MESSAGE = "Insufficient Balance";

    public static final String DESTINATION_ACCOUNT_NOT_EXISTS_CODE = "008";
    public static final String DESTINATION_ACCOUNT_NOT_EXISTS_MESSAGE = "User with this destination account number does not exists!";

    public static final String ACCOUNT_TRANSACTION_CODE = "009";
    public static final String ACCOUNT_TRANSACTION_MESSAGE = "User Amount transfer from Source to destination(Host to Host)";

    public static final String LOGIN_MESSAGE = "Login Success!!";

    //Current year + random six digits generate and return
    public static String generateAccountNumber() {
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String year = String.valueOf(currentYear);
        String randomNo = String.valueOf(randomNumber);
        return year + randomNo;
    }
}
