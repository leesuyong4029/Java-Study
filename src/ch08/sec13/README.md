# 8.13 봉인된 인터페이스

Java 15부터는 무분별한 자식 인터페이스 생성을 방지하기 위해 봉인된(sealed) 인터페이스를 사용할 수 있다.
sealed 키워드를 사용하면 permits 키워드 뒤에 상속 가능한 자식 인터페이스를 지정해야 한다.

non-sealed는 봉인을 해제한다는 뜻이다.

```java
public sealed interface InterfaceA permits InterfaceB { ... }
```

```java
public non-sealed interface InterfaceB extends InterfaceA { ... }
```

```java
public interface InterfaceC extends InterfaceB { ... }
```