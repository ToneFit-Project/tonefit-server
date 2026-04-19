package com.example.tonefitserver.core.exception;

import com.example.tonefitserver.core.enums.ErrorType;

public class BusinessException extends TonefitException {
    public BusinessException(ErrorType errorType) {
        super(errorType);
    }
}
