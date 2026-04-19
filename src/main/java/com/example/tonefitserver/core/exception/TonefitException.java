package com.example.tonefitserver.core.exception;

import com.example.tonefitserver.core.enums.ErrorType;
import lombok.Getter;

@Getter
public abstract class TonefitException extends RuntimeException {
    private final ErrorType errorType;

    protected TonefitException(ErrorType errorType) {
        super(errorType.getMessage());
        this.errorType = errorType;
    }
}
