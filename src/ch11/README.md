# 11.3 예외 종류에 따른 처리
try 블록에는 다양한 종류의 예외가 발생할 수 있다. 다중 catch를 사용하면 발생하는 예외에 따라 예외 처리 코드를 다르게 작성할 수 있다.
catch 블록의 예외 클래스는 try 블록에서 발생된 예외의 종류를 말하는데, 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행된다.

catch 블록이 여러 개라 할지라도 catch 블록은 단 하나만 실행된다. 그 이유는 try 블록에서 동시 다발적으로 예외가 발생하지 않으며,
하나의 예외가 발생하면 즉시 실행을 멈추고 해당 catch 블록으로 이동하기 때문이다. 

처리해야 할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 catch 블록을 먼저 작성하고 상위 클래스 catch 블록을 나중에 작성해야 한다. 

두 개 이상의 예외를 하나의 catch 블록으로 동일하게 예외 처리하고 싶을 때가 있다. 이 경우에는 catch 블록에 예외 클래스 기호 | 로 연결하면 된다.

# 11.5 예외 떠넘기기 
메소드 내부에서 예외가 발생할 때 try-catch 블록으로 예외를 처리하는 것이 기본이지만, 메소드를 호출한 곳으로 예외를 떠넘길 수도 있다.
이때 사용하는 키워드가 throws이다. throws는 메소드 선언부 끝에 작성하는데, 떠넘길 예외 클래스를 쉼표로 구분해서 나열해주면 된다.
```java
리턴타입 메소드명(매개변수,...) throws 예외클래스1, 예외클래스2, ... {
        }
```

thows 키워드가 붙어 있는 메소드에서 해당 예외를 처리하지 않고 떠넘겼기 때문에 이 메서드를 호출하는 곳에서 예외를 받아 처리해야 한다. 

나열해야 할 예외 클래스가 많을 경우에는 throws Exception 또는 throws Throwable 만으로 모든 예외를 간단히 떠넘길 수도 있다.
```java
리턴타입 메서드명(매개변수,...) throws Exception {
}
```

main() 메소드에서도 throws 키워드를 사용해서 예외를 떠넘길 수도 있는데, 결국 JVM이 최종적으로 예외 처리를 하게 된다.
JVM은 예외의 내용을 콘솔에 출력하는 것으로 예외 처리를 한다.
```java
public static void main(String[] args) throws Exception {
        ...
        }
```

# 11.6 사용자 정의 예외
사용자 정의 예외는 컴파일러가 체크하는 일반 예외로 선언할 수도 있고, 컴파일러가 체크하지 않는 실행 예외로 선언할 수도 있다.
통상적으로 일반 예외는 Exception의 자식 클래스로 선언하고, 실행 예외는 RuntimeException의 자식 클래스로 선언한다. 
```java
public class XXXException extends [ Exception | RuntimeException ] {
        public XXXException() { // 기본 생성자
        }
        
        public XXXException(String message) { // 예외 메시지를 입력받는 생성자 
            super(message);
        }
        }
```
```java
void method() throws Exception {
        ...
        throw new Exception("예외메시지");
        ...
        }
```