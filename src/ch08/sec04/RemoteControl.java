package ch08.sec04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 (메서드 선언부만 작성)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

// 구현 클래스인 Television과 Audio는 인터페이스에 선언된 모든 추상 메소드를 재정의해서 실행 코드를 가져와야 한다.
