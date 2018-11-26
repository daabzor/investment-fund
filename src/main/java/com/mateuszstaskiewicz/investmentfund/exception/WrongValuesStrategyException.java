package com.mateuszstaskiewicz.investmentfund.exception;

public class WrongValuesStrategyException extends StrategyException {

    public WrongValuesStrategyException(String message) {
        super(message);
    }

    public WrongValuesStrategyException(String message, Throwable cause) {
        super(message, cause);
    }
}
