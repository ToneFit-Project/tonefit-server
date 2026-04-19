package com.example.tonefitserver.core.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorType {
    INVALID_REQUEST(HttpStatus.BAD_REQUEST, "INVALID_REQUEST", "요청 형식 오류"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", "토큰 없음 또는 만료"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "FORBIDDEN", "권한 없음"),
    NOT_FOUND(HttpStatus.NOT_FOUND, "NOT_FOUND", "리소스 없음"),
    EMAIL_ALREADY_EXISTS(HttpStatus.CONFLICT, "EMAIL_ALREADY_EXISTS", "이미 가입된 메일 주소"),
    TOO_MANY_REQUESTS(HttpStatus.TOO_MANY_REQUESTS, "TOO_MANY_REQUESTS", "일일 무료 횟수 또는 재교정 횟수 초과"),
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL_ERROR", "서버 내부 오류"),
    AI_SERVICE_ERROR(HttpStatus.BAD_GATEWAY, "AI_SERVICE_ERROR", "Gemini API 호출 실패");

    private final HttpStatus status;
    private final String code;
    private final String message;
}
