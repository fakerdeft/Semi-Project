# Semi-Project
匠人(장인)들을 위한 프리미엄 쇼핑몰<br>
Premium Shopping Mall for Master<br>

## 간단한 사이트 소개
회원등급 및 권한 - 일반<장인<관리자
<br><br>
장인이 되려면 관리자의 승인 필요.
<br>
 - 판매자 - 장인 
 - 구매자 - 일반, 장인


## Usecase Diagram

<img src="https://github.com/fakerdeft/Semi-Project/blob/main/www.PNG?raw=true" width="1000px" height="700px" alt=""></img><br/>


## 나의 기능 
- 회원가입
  - 아이디 중복 유효성 검사
  - 주소 api 사용
  - 모든 입력 정규표현식 적용
- 로그인
  - 아이디저장
- 로그아웃
- 아이디찾기
  - 이름&전화번호 입력
- 비밀번호찾기
  - 아이디&현재 비밀번호 입력
  - 새 비밀번호
  - 정규표현식 적용
- 정보수정
  - url접근 불가능, 로그인 상태에서만 접근 가능
  - 현재 비밀번호 입력
  - 정규표현식 적용
- 비밀번호수정
  - url접근 불가능, 로그인 상태에서만 접근 가능
  - 현재 비밀번호 입력
  - 새 비밀번호
  - 정규표현식 적용
- 회원탈퇴
  - 현재 비밀번호 입력
