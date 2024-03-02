# 익명 구현 객체
익명 구현 객체는 인터페이스를 구현해서 다음과 같이 생성된다. 이렇게 생성된 객체는 인터페이스 타입의 필드로, 로컬변수, 매개변수의 값으로 대입할 수 있다.
익명 구현 객체는 안드로이드와 같은 UI 프로그램에서 이벤트를 처리하는 객체로 많이 사용된다.

```java
new 인터페이스() {
    // 필드
    // 메서드    
}
```

중괄호 블록 안의 필드와 메서드는 익명 구현 객체가 가져야 할 멤버로, 중괄호 블록 안에서만 사용할 수 있다. 그 이유는 익명 구현 객체는
인터페이스 타입에 대입되므로 인터페이스 타입에 선언된 멤버만 접근할 수 있기 때문입니다. 중괄호 블록 안에는 주로 인터페이스의 
추상 메서드를 재정의하는 코드가 온다.