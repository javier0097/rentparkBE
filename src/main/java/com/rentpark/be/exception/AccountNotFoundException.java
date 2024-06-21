package com.rentpark.be.exception;

public class AccountNotFoundException extends ApplicationException {

    public AccountNotFoundException(String message) {
        super(message);
    }
}
