# 작업 계획서
## 공통 작업
1. docker-compose.yml 구성 (완료)
2. jwt auth 구조 + security config 작업
    - Bearer 토큰 사용
3. 에러 코드 설계

| HTTP 상태 | 코드 | 설명 |
| --- | --- | --- |
| 400 | `INVALID_REQUEST` | 요청 형식 오류 |
| 401 | `UNAUTHORIZED` | 토큰 없음 또는 만료 |
| 403 | `FORBIDDEN` | 권한 없음 |
| 404 | `NOT_FOUND` | 리소스 없음 |
| 409 | `EMAIL_ALREADY_EXISTS` | 이미 가입된 메일 주소 |
| 429 | `TOO_MANY_REQUESTS` | 일일 무료 횟수 또는 재교정 횟수 초과 |
| 500 | `INTERNAL_ERROR` | 서버 내부 오류 |
| 502 | `AI_SERVICE_ERROR` | Gemini API 호출 실패 |

- 위 에러는 비즈니스 에러 형식이다.
- TonefitException가 기본 비즈니스 에러이고 RuntimeException을 상속 받은 abstract class 이며 핸들러 1개로 모든 에러를 처리한다.