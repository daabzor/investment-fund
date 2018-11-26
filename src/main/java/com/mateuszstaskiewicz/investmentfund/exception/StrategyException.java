package com.mateuszstaskiewicz.investmentfund.exception;

public class StrategyException extends RuntimeException {

    public StrategyException(String message) {
        super(message);
    }

    public StrategyException(String message, Throwable cause) {
        super(message, cause);
    }
}
