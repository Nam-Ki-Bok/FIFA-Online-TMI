# ⚽️ FIFA Online 4 - TMI

카트라이더 TMI 서비스와 같이 넥슨 오픈API를 이용해 피파 온라인 전적 정보를 제공하는 서비스 입니다.

https://tmi.nexon.com/kart

### 개발중..

<img src="https://user-images.githubusercontent.com/54533309/108509350-78dee580-7300-11eb-88cd-c9654fb8e1d0.gif" alt="ezgif com-gif-maker" width=800; />

## 🛠 기술 스택

### Front-end

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://img.icons8.com/color/48/000000/html-5.png"/> <img src="https://img.icons8.com/color/48/000000/css3.png"/> <img src="https://img.icons8.com/color/48/000000/javascript-logo-1.png"/> <img src="https://user-images.githubusercontent.com/54533309/105577337-40f58880-5dbc-11eb-8aa5-24e767a38beb.png" alt="image" width="55"> <img src="https://img.icons8.com/color/48/000000/bootstrap.png"/>

### Back-end

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://user-images.githubusercontent.com/54533309/105580728-66d95800-5dd1-11eb-8d5c-3d0c254ed9f3.png" alt="image" width="130">

### Build Tool

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="https://user-images.githubusercontent.com/54533309/105578727-866a8380-5dc5-11eb-889e-67692d130c06.png" alt="image" width="140">

## 📬 NEXON OPEN API

https://developers.nexon.com

<img src="https://user-images.githubusercontent.com/54533309/106356814-b675d180-6345-11eb-8220-3eb5ec183ea5.png" alt="스크린샷 2021-01-30 오후 9 54 18" width="1000">

## 📚 개발 과정

<a href="https://nam-ki-bok.github.io/spring/UserInfo/" style="color:#0FA678">[FIFA Online TMI] 넥슨 Open API로 유저 정보 가져오기</a>

<a href="https://nam-ki-bok.github.io/spring/ViewUserInfo/" style="color:#0FA678">[FIFA Online TMI] 넥슨 Open API로 가져온 유저 정보 출력하기</a>

<a href="https://nam-ki-bok.github.io/spring/StatusCanceled/" style="color:#0FA678">[FIFA Online TMI] Enter 키로 검색하기, Status=canceled</a>

<a href="https://nam-ki-bok.github.io/spring/MatchType/" style="color:#0FA678">[FIFA Online TMI] 매치 타입 메타데이터 받아와 저장하기</a>

<a href="https://nam-ki-bok.github.io/spring/MatchTypeInServer/" style="color:#0FA678">[FIFA Online TMI] 유저 최고 등급 서버단에서 가져오도록 수정 및 메타 데이터 매핑</a>

<a href="https://nam-ki-bok.github.io/spring/BuyRecord/" style="color:#0FA678">[FIFA Online TMI] 넥슨 Open API로 유저 구매 내역 출력하기</a>

<a href="https://nam-ki-bok.github.io/spring/ErrorPage/" style="color:#0FA678">[FIFA Online TMI] 에러 페이지 설정하기</a>

## ❗️이슈

📌 [2021.02.01] #1 유저 정보를 가져와 alert 로 확인했으니 보여주는 화면 구성해야 함 ✔️

📌 [2021.02.02] #2 User 테이블의 PK 를 nickname 으로 바꿔야 함 ✔️

📌 [2021.02.02] #3 유저 기본정보를 보여주는 URI 도 /user/info/nickname 으로 바꿔야 함 ✔️

📌 [2021.02.03] #4 유저명 입력 후 엔터키를 눌러도 검색할 수 있게 추가해야 함 ✔️

📌 [2021.02.04] #5 Nexon Open API 찌르는 위치를 class 로 할지 ajax 로 할지 생각해보기 ✔️

- API 를 통해 정보를 가져와 바로 프론트로 뿌려주는 로직이라면 js 에서 끝내고 

  정보를 가져와 백에서 처리하는 과정이 있다면 class 로 가져오는게 낫다고 한다.

📌 [2021.02.05] #6 JQuery 에서 바닐라 JS 로 바꾸기 (ajax &rarr; fetch) ✔️
- index.js 파일을 JQuery 에서 바닐라 JS 로 바꾸었으나 

  Enter 키로 검색 시 API 요청을 두 번하는 오류가 발생해 통신은 ajax 로 두었다. 
  
  ⬆️ keyup 으로 Enter 키를 검사했더니 발생했던 오류였다. keydown 으로 바꾸니 고쳐졌다.

📌 [2021.02.06] #7 ajax or fetch 로 Nexon OPEN API 를 찌르는 경우 API KEY 숨기는 방법 공부하기 ✔️

📌 [2021.02.06] #8 메타 데이터 GET 요청시 CORS 에러 발생, 직접 다운로드 받아서 저장 해야하는지 확인 ✔️

- 브라우저에서 직접 요청하면 CORS 에러가 발생하지만 서버단에서 요청하면 CORS 에러 없이 받아 온다.

  원리가 무엇이길래 서버단에서 요청하면 CORS 에러가 발생하지 않는지 알아야 한다..
  
  ⬆️ 브라우저에서 직접 요청하면 키를 아무리 숨겼다 해도 사용자가 **console.log(key)** 를 통해 바로 알 수 있다.
  
  때문에 넥슨에서 브라우저에서 직접 요청하는 경우를 막아두었다고 한다.

📌 [2021.02.08] #9 메타 데이터와 매치 종류, 최고 등급 매핑 해야 함 ✔️

- 서버단에서 받아와 DB 에 저장 성공! 필요할 때 마다 id 로 검색해서 사용하면 된다.

📌 [2021.02.13] #10 API KEY 를 사용하는 모든 요청을 서버단으로 이동 ✔️

- 키 값을 숨겨서 사용한다고 해도 프론트단에서 키를 사용하면 누구든지 console.log 를 통해 볼 수 있다..

📌 [2021.02.15] #11 ResponseDTO 를 바로 다른 용도로 사용 해야하는 경우 RequestDTO 로 바꾸어야 하는지?

📌 [2021.02.16] #12 선수 정보 메타 데이터를 받아오는데 시간이 너무 오래 걸려 DB를 바꾸어야 한다. ✔️

- 바꿔봤는데 선수 정보 메타 데이터 양이 너무 많아 저장 할 수 있는 limit 에 걸려버려 저장을 못 한다.
때문에 선수 정보 메타 데이터를 사용 하기보다 선수 아이디를 가지고 이미지를 띄워주기로 했다.

📌 [2021.02.22] #13 에러 페이지 작성 해야함 ✔️