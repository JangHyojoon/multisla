# 프로젝트 : Multisla
자동차 온라인 커스터마이징 판매 웹서비스 개발


### 시연영상 



https://user-images.githubusercontent.com/103174607/175891876-d0cfa8e1-613f-44b8-b742-8d79026e4e44.mp4



## 1. 제작 기간 & 참여 인원
- 2022년 06월 16일 ~ 06월 26일
- 팀 프로젝트 (장효준 / 신승욱 / 진가영)
## 2. 사용 기술
#### `협업도구`
- zoom
- gitHUB

#### `Data Base`
- MySQL

#### `Back-end`
- Java8
- Spring Boot
- Java Script

#### `Front-end`
- CSS
- HTML
- Bootstrap
- jQuery
- Ajax
- Java Script
- kakao developers
- 
## 3. ERD 설계
![ERD](https://user-images.githubusercontent.com/103174607/175862522-ea573639-8caa-4aea-a1c6-6f25897d73ec.png)
### 3-1. ERD 설계 단계 주요 쟁점

#### 3-1-1. 고객이 직접 만드는 차
##### 고객이 차의 종류와 옵션을 커스터마이징하고 바로 가격을 확인 가능하여야 함
##### 차 종류와 옵션들의 테이블을을 만들어 옵션과 가격을 설정
##### 옵션들의 테이블들을 상속받아 견적 테이블이 생성되도록 설계

#### 3-1-2고객이 만든 차 견적 데이터의 관리
##### 주문 된 차와 주문되지 않은 차의 구분을 위해 주문여부를 위한 플래그를 생성
##### 차 견적시 플래그는 FALSE의 상태이며 고객이 주문 시 TRUE로 업데이트
##### 많은 데이터가 쌓일 시 플래그가 FLASE인 데이터를 삭제하여 데이터베이스 관리를 용이하게 함


## 4. 핵심 기능
### 4.1. 페이지 흐름
![image](https://user-images.githubusercontent.com/103157377/175880032-0aae2008-b3c9-468d-827f-83382d1593ec.png)
<br>

### 4.a. Build

#### 4.a.1 견적 사진 고정

- 스크롤을 움직여도 차량 사진에 해당하는 부분을 css로 움직이지 못하게 함으로 써 여러 옵션을 적용할 때 한 눈에 알아보기 쉽다.
  ![build image fixed](https://user-images.githubusercontent.com/103157377/175864776-e70f94bd-1080-4fb1-9edf-f8d6669a2401.gif)
  <br>

#### 4.a.2 견적 사진 변경
- 차량에 원하는 옵션을 적용하면 해당 옵션에 따라 사진이 `fade out`과 `fade in`이 되도록 제어

  ![build image changed](https://user-images.githubusercontent.com/103157377/175865874-35255cb6-77d2-4861-9dfd-7f8debc4114b.gif)
<br>

#### 4.a.2 견적 가격 실시간 반영

- 원하는 옵션을 선택하면 해당 옵션에 맞는 최종 예상 가격이 화면 하단에 표시된다.

  ![build price](https://user-images.githubusercontent.com/103157377/175876818-47e5b0f8-3e91-4878-bcba-8a62892f2b26.gif)
<br>

### 4.b. 필수적 기능의 Login, Register
#### 4.b.1 견적 작성 후 이미 로그인이 되어있을 때

- 이미 로그인이 된 상태에서 견적을 작성하면 바로 '내 차고'로 견적이 담긴다.

  ![build to garage](https://user-images.githubusercontent.com/103157377/175868255-abb77dd9-107b-42e2-aa17-a640eac97f35.gif)
<br>

#### 4.b.2 견적 작성 후 로그인이 되어있지 않았을 때

- 견적 작성을 완료한 후 '차고에 담기'버튼을 눌렀을 때, 로그인이 되어있지 않으면 로그인 화면으로 이동

- 로그인이 완료되면 '내 차고'로 사용자가 원하던 견적이 담긴다.

  ![build to login](https://user-images.githubusercontent.com/103157377/175867098-541599ff-7e00-4910-be02-e1916c0fbb6d.gif)
<br>

#### 4.b.3 견적 작성 후 회원 가입이 되어있지 않을 때

- 견적 작성을 완료한 후 '차고에 담기' 버튼을 눌렀을 때, 회원가입이 되어있지 않으면 회원가입 화면으로 이동

- 회원 가입이 완료되면 자동으로 로그인이 되고 '내 차고'로 이동한다.

  ![build to register](https://user-images.githubusercontent.com/103157377/175868826-7345d40e-6c78-40f6-bb8f-4a259a7f163e.gif)

<br>

### 4.c. Garage
#### 4.c.1 견적서와 주문내역 조회

- 사용자가 견적을 작성하면 '내 차고'에서 지금까지 만들어놓은 견적을 볼 수 있다.

- 자동차를 주문하더라도 주문 내역까지 한 눈에 볼 수 있다.

  ![image](https://user-images.githubusercontent.com/103157377/175870573-12756ea4-d87e-493e-a8ef-463b3324c740.png)
<br>

#### 4.c.2 모델명 별로 견적서와 주문내역 조회 가능

- 모델명 버튼을 클릭하면 해당 모델명에 맞는 견적서나 주문내역을 간단히 조회할 수 있다.

  ![garage filter](https://user-images.githubusercontent.com/103157377/175870850-b58f0e85-7fbb-45f7-a20d-a83aaaae3a25.gif)
<br>

#### 4.c.3 '내 차고'에 있는 차량 수 만큼 장바구니 아이콘 표시

- '내 차고'에 견적을 작성하면 사용자가 작성한 견적의 개요와 차량 개수가 우측 상단 장바구니 아이콘에 마우스를 올리면 화면에 표시된다.

- 단, 이미 주문이 완료된 차량은 표시되지 않는다.

  ![image](https://user-images.githubusercontent.com/103157377/175871370-fb5326d9-1320-4799-abcb-ade0506cc491.png)
<br>

### 4.d. Garage Detail
#### 4.d.1 '내 차고'에서 견적과 주문 내역에 대한 상세 정보를 조회할 수 있다.

- garage에서 'View Details'를 누르면 견적에 대한 상세 정보를 조회할 수 있다.

  ![garage to garagedetail(build)](https://user-images.githubusercontent.com/103157377/175872345-55a4a485-4fdf-4733-9d0f-1a44711c98bc.gif)

- 주문 내역에 대한 상세 정보도 조회할 수 있다.

  ![garage to garagedetail(orders)](https://user-images.githubusercontent.com/103157377/175872608-747fedb9-ef06-4cda-93c9-1b29c3eca0b7.gif)
<br>

#### 4.d.1 Delete/Modify

- 작성했던 견적을 삭제할 수 있다.

  ![garagedetail delete](https://user-images.githubusercontent.com/103157377/175873120-b862c890-52e7-4ec3-8446-1de234d3b316.gif)

- '수정하기'를 눌러 견적을 수정할 수 있는데, 이전에 선택했던 옵션들이 선택이 된 상태로 화면이 생성된다.

  ![garagedetail modify](https://user-images.githubusercontent.com/103157377/175873836-d07ef481-0e7f-4b70-b404-8fbbe2f7457c.gif)
<br>

### 4.e. Orders
#### 4.e.1 차량 주문하기

- Garage Detail에서 '주문하기' 버튼을 누르면 주문 화면이 나타난다.

- 주문 화면에서 배송지 정보 등을 변경하고 '주문하기' 버튼을 누르면 주문이 완료되고 Garage Detail 화면이 나온다.

  ![orders](https://user-images.githubusercontent.com/103157377/175875333-7b1590cd-dc5c-46bc-9ab8-c40fc5b684b9.gif)
<br>

### 4.e. Orders Detail
#### 4.e.1 주문 상세 정보 조회하기

- 주문이 완료된 후 Garage Detail 화면에서 '주문 상세' 버튼을 누르면 세부 정보가 전부 표시된다.

  ![orders detail](https://user-images.githubusercontent.com/103157377/175876159-b635a788-5abd-4947-a11a-ac195b78460b.gif)
<br>

### 4.f. 필수 기능에 대한 보안 적용

#### 4.f.1 로그인 보안 기술

- 화면 흐름도에서 build 이후에 일어나는 모든 기능들은 옳바른 사용자가 로그인 하지 않으면 기능들을 쓸 수 없도록 막아야 한다.
- 그렇지 않으면 개인정보 유출과 같은 사고가 일어날 수 있다.
- 로그인 상태에서 링크를 복사해 테스트를 진행했다.

<br>

#### 4.f.2 로그인에 대한 보안

- 로그아웃 상태에서 접근

  ![garage secure](https://user-images.githubusercontent.com/103157377/175882121-7a50454d-8bef-4a3a-bf6d-e5901a3427b6.gif)

- 다른 사용자로 로그인 했을 때 접근

  ![garage secure login](https://user-images.githubusercontent.com/103157377/175882697-f5bf3d1d-cd4f-435e-9a25-ea243546e609.gif)

<br>

## 5. 핵심 트러블 슈팅
#### 5-1. 차 견적 시 비로그인인 경우 
차 견적 완료 후 내 차고에 담을시 비로그인인 경우 로그인을 유도하였습니다.
하지만 로그인시 비로그인일때의 견적을 유지할 필요가 있었습니다.
이를 해결하기 위해서 쿠키수집을 활용하여 해당 성능을 완료하였습니다.
#### 5-2. 비정상적인 경로 차단(비로그인시 개인정보 관련 페이지 접속 차단)
웹페이지 개발 중 로그인이 되어있지 않은 상황에서 id값을 활용해 주소접속 시 접속이 된다는 문제점을 발견했습니다.
이를 해결하기 위해서 각 페이지마다 로그인시 수집했던 Session값을 사용하여 접속을 차단하는 기능을 구연하였습니다.
