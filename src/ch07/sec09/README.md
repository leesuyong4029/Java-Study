# 7.9 객체 타입 확인
매개변수의 다형성에서 실제로 어떤 객체가 매개값으로 제공되었는지 확인하는 방법이 있다. 꼭 매개변수가 아니더라도
변수가 참조하는 객체의 타입을 확인하고자 할 때, instanceof 연산자를 사용할 수 있다.
instanceof 연산자의 **좌항**에는 **객체**가 오고 **우항**에는 **타입**이 오는데, 좌항의 객체가 우항의 타입이면 
true를 산출하고 그렇지 않으면 false를 산출한다.
```java
boolean result = 객체 instanceof 타입; 
```

예를 들어 다음 코드는 Child 타입으로 강제 타입 변환하기 전에 매개값이 Child 타입인지 여부를 instanceof 연산자로 확인한다.
Child 타입이 아니라면 강제 타입 변환을 할 수 없기 때문이다. **강제 타입 변환을 하는 이유는 Child 객체의 모든 멤버(필드, 메소드)에 접근하기 위해서이다.**

```java
-> Parent 객체, Child 객체 
public void method(Parent parent) {
    if(parent instanceof Child) { // parent 매개변수가 참조하는 객체가 Child인지 조사 
        Child child = (Child) parent;
        // child 변수 사용 
        }
        }
```
```java
if (parent instanceof Child child) {
    // child 변수 사용 
        }
```
Java 12부터는 instanceof 연산의 결과가 true일 경우, 우측 타입 변수를 사용할 수 있기 때문에 강제 타입 변환이 필요 없다.