package com.mateuszstaskiewicz.investmentfund.exception;

public class FundTypeListException extends RuntimeException {

    public FundTypeListException(String message) {
        super(message);
    }

    public FundTypeListException(String message, Throwable cause) {
        super(message, cause);
    }
}
