package ch09.sec06.exam01;

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener { // 중첩 인터페이스 선언
        // 추상 메서드
        void onClick();
    }
}
