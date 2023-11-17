# Markdown
마크다운에 대해 알아봅시다.

## Markdown 이란?
텍스트 기반의 마크업 언어이다.(유명한 마크업언어중에는 HTML이 있다.) HTML로 변환이 가능하다. 매우 간단한 구조의 문법을 이용하여 웹에서도 빠르게 컨텐츠를 작성 가능하다.

## Markdown의 장-단점
### 장점
1. 간결하다
2. 별도의 도구 없이 작성 가능하다.
3. 다양한 형태로 변환이 가능하다.
4. 텍스트로 저장되기 때문에 보관이 용이하다.
5. 지원하는 프로그램과 플랫폼이 다양하다.

### 단점
1. 표준이 없다.
2. 표준이 없기때문에 도구에 따라서 변환방식이나 생성물이 다르다.
3. 모든 HTML 마크업을 대신하지 못한다.

## Markdown 문법

### 헤더 1
```
This is a H1
==============
This is a H2
--------------
```
This is a H1
==============
This is a H2
-------------
### 헤더 2
```
# This is a H1
## This is a H2
### This is a H3
#### This is a H4
##### This is a H5
###### This is a H6
```
# This is a H1
## This is a H2
### This is a H3
#### This is a H4
##### This is a H5
###### This is a H6
####### This is a H7 <- 지원하지 않는다. 6개까지만

## 수평선
-또는 *또는 _를 3개 이상 작성  
단 -를 사용할 경우 헤더로 인식 할 수 있으니 이 전 라인은 비워둬야한다.
```
* * *
- - -
_ _ _

```
* * *
- - -
_ _ _
## 줄바꿈
<br>을 활용해서 줄바꿈을 할 수 있다.

## 강조
```
_기울여쓰기_
__두껍게쓰기__
~~취소선~~
___두껍게기울여쓰기___
```
_기울여쓰기_  
__두껍게쓰기__  
~~취소선~~  
___두껍게기울여쓰기___

## 인용
`>`로 시작하는 텍스트, 3개까지 가능하다.
```
># This is H1
>> * This is list
>>> `This is textbox`
```
># This is H1
>> * This is list
>>> `This is textbox`

## 목록
리스트 안 리스트를 만들 수 있다.
### 순서가 없는 목록
`*, +, -`를 이용해서 순서가 없는 목록을 만들 수 있다.
```
* 1
    * 2
        * 3

- 1
    * 2
        * 3

- 1 
    * 2
        + 3
```
* 1
    * 2
        * 3

- 1
    * 2
        * 3

- 1
    * 2
        + 3

### 순서가 있는 목록
숫자를 이용해서 만들 수 있다. 순서가 섞이면 숫자만 바뀐다.
```
1. a
2. b
3. c

4. a
6. c
5. b
```
1. a
2. b
3. c
4. a
6. c
5. b

## 특수문자 표시
특수문자를 표현할 떄, 표시될 문자 앞에 \를 넣고 특수문자를 쓰면 된다
```
- 특문 표시됨
\- 특문 표시 안됨
```
- 특문 표시됨  

\- 특문 표시 안됨
## 코드블럭
간단한 인라인 코드는 텍스트를 앞뒤로 \` 기호로 감싸면 된다.  
여러줄은 \`\`\`이나 \~\~\~로 앞뒤를 감싸면 된다.  
\`\`\`옆에 언어를 지정하면 syntax color가 적용된다.

```java
class test(){
    System.out.println("hello world");
}
```
## 표
헤더와 셀을 구분할 떄 3개 이상의 -기호가 필요하다
헤더, 셀을 구분하면서 : 기호로 칸 안에 내용을 정렬 할 수 있다.
가장 좌측과 우측의 |기호는 생략 가능
```
테이블 생성

헤더1|헤더2|헤더3|헤더4
---|---|---|---
셀1|셀2|셀3|셀4
셀5|셀6|셀7|셀8
셀9|셀10|셀11|셀12
```
테이블 생성

헤더1|헤더2|헤더3|헤더4
---|---|---|---
셀1|셀2|셀3|셀4
셀5|셀6|셀7|셀8
셀9|셀10|셀11|셀12


## 링크
```
[구글](https://www.google.com)
[구글] : https://www.google.com
```

[구글](https://www.google.com)  
[구글] : https://www.google.com
## 이미지
링크와 비슷하지만 앞에 !가 붙는다

* 인라인 이미지
```
![텍스트](/이미지 이름.형식)
![구글](/google.png)
```
![구글](/Markdown\google.png)

* 링크 이미지
```
![텍스트](이미지파일URL)
```
![구글](https://i.namu.wiki/i/_q21QrQydgDKOMD7mbYLBYyhsYoHSHSVNoZvIOnF0wkICLz1HNrRNJQsxc_zKrb1TNE-1RUrV7t3JdVMG4Y9jGkSU7QryGiDWXQ3b2X0AdFIHQus-GZWQL0sbZJKKOMwvHUQ_NxFwN23Y3EycDwTHQ.svg)


이미지파일 이름이나 경로 옆에 "이미지 이름"을 넣으면 이미지에 커서를 올렸을 때 이미지 이름이 나온다.

* 링크와 이미지를 합친 방법 (이미지를 링크로 사용)
```
[![텍스트](이미지URL)](링크 URL)
```
[![구글](https://i.namu.wiki/i/_q21QrQydgDKOMD7mbYLBYyhsYoHSHSVNoZvIOnF0wkICLz1HNrRNJQsxc_zKrb1TNE-1RUrV7t3JdVMG4Y9jGkSU7QryGiDWXQ3b2X0AdFIHQus-GZWQL0sbZJKKOMwvHUQ_NxFwN23Y3EycDwTHQ.svg)](https://www.google.com)