package com.mateuszstaskiewicz.investmentfund.exception;

public class EmptyListException extends GroupCalculatorException {

    public EmptyListException(String message) {
        super(message);
    }

    public EmptyListException(String message, Throwable cause) {
        super(message, cause);
    }

}
