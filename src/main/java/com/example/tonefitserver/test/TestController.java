package com.example.tonefitserver.test;

import com.example.tonefitserver.core.common.ApiResponse;
import com.example.tonefitserver.core.enums.ErrorType;
import com.example.tonefitserver.core.exception.BusinessException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/success")
    public ApiResponse<String> testSuccess() {
        return ApiResponse.success("Hello Tonefit!");
    }

    @GetMapping("/error")
    public ApiResponse<Void> testError() {
        throw new BusinessException(ErrorType.INVALID_REQUEST);
    }
}
