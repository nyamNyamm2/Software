# 리스코프 교체 원칙

+ 정의
  + 상위 클래스의 객체는 언제나 자신의 하위 클래스의 객체로 교체 가능해야 한다.
+ 설계 방법
  + 상위 클래스의 메소드를 추상 메소드로 만든다.
  + 해당 코드에서 오버로딩하는 상위 클래스 Lecturer의  Lecturer()메소드를 추상메소드로 설계하였다.

### 클래스도
![LSP UML class](./LSP.png)

### 통신도
![LSP UML class](./LSP.jpg)
