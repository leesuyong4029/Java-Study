package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;

        // Television 객체를 생성하고 인터페이스 변수에 대입
        // 인터페이스로 Television 객체를 사용
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체를 생성하고 인터페이스 변수에 대입
        // 인터페이스로 Audio 객체를 사용
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 인터페이스로 구현 객체를 사용하려면 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다.
        // 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입되면 구현 객체의 번지를 저장해야 한다.
        // 구현 객체가 대입되면 인터페이스 변수로 추상 메소드를 호출할 수 있게 된다. 이때 어떤 구현 객체가 대입되었는지에 따라
        // 실행 내용이 달라진다.
        // Television이 대입되었다면 Television의 재정의된 메서드가, Audio가 대입되었다면 Audio의 재정의된 메서드가 실행된다.
    }
}
