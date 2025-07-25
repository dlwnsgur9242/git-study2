# 소개. Blog Service
--------------------
- 블로그 검색과 관련된 서비스를 제공합니다.

# 빌드 결과물
- [결과물 다운로드](https://naver.com)

# 환경 소개
- JAVA 17
- SpringBoot 2.7.3
- ...

# module - application
 - 도메인 엔티티, 입력 포트, ....
   - `domain`
   - `service`

### 사용
ㄴㄴ
> $ https GET `https://naver.com`


### 요청

Parameter

| Name     | Type | Description | Required |
|----------|----|----|---|
| keyword  | String | 검색 키워드 | O |
| url | String | 블로그 URL (특정 블로그 글만 검색하고 싶은 경우)| X|