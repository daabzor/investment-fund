package com.mateuszstaskiewicz.investmentfund.exception;

public class WrongValuesGroupException extends GroupCalculatorException {

    public WrongValuesGroupException(String message) {
        super(message);
    }

    public WrongValuesGroupException(String message, Throwable cause) {
        super(message, cause);
    }

}
