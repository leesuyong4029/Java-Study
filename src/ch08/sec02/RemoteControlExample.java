package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
//        RemoteControl rc;
//        rc = new Television();
        RemoteControl rc;

        // rc 변수에 Television 구현 객체를 대입
        rc = new Television();
        rc.turnOn();

        // rc 변수에 Audio 구현 객체를 대입 (교체 시킴)
        rc = new Audio();
        rc.turnOn();
    }
}
