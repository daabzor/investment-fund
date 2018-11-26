package com.mateuszstaskiewicz.investmentfund.exception;

public class GroupCalculatorException extends RuntimeException {

    public GroupCalculatorException(String message) {
        super(message);
    }

    public GroupCalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
