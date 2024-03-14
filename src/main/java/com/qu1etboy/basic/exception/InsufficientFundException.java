package com.qu1etboy.basic.exception;

/**
 * RuntimeException -> Unchecked
 * Exception -> Checked
 */
public class InsufficientFundException extends RuntimeException {

    public InsufficientFundException() {

    }

    public InsufficientFundException(String message) {
        super(message);
    }
}
