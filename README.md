# Spring Web Controller 예제

<img src="https://img.shields.io/badge/spring--boot-jpa-brightgreen?logo=springboot&logoColor=white"/>
<img src="https://img.shields.io/badge/junit5-brightgreen?logo=junit5&logoColor=white"/>

## 설명
String, json형태의 String, json의 list형태의 String을 return합니다.

## 실행방법
TestApplication을 실행 하면 됩니다.

## API Endpoint
get : http://localhost/api/v1/order/
- success

get : http://localhost/api/v1/order/json
- res : {"id":0,"name":"order1"}

get : http://localhost/api/v1/order/json_list
- res : [{"id":0,"name":"order1"}]


post : http://localhost/api/v1/order/
