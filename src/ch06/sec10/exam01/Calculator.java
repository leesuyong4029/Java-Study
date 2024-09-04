package ch06.sec10.exam01;

public class Calculator {
    static double pi = 3.14159;

    static int plus(int x, int y) {
        return x + y;
    }

    static int minus(int x, int y) {
        return x - y;
    }
}

// 정적 요소는 클래스 이름으로 접근하는 것이 정석이다.
// 정적 멤버 사용
// 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있는데, 클래스 이름과 함께 (.) 도트 연산자로 접근하면 된다.
// 정적 필드와 정적 메소드는 다음과 같이 객체 참조 변수로도 접근이 가능하다.
// 인스턴스 필드를 이용하지 않는 메소드는 정적 메소드로 선언하는 것이 좋다.

