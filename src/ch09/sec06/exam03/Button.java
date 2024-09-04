package ch09.sec06.exam03;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        // 추상 메서드
        void onClick();
    }

    // 필드
    private ClickListener clickListener; // Setter를 통해 제공된 ClickListener 구현 객체의 참조를 가지고 있다.

    // 메서드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick(); // Button이 클릭되었을 때 실행하는 메서드 선언
    } // onClick() 메서드를 호출하면 ClickListenter 구현 객체의 onClick() 메서드가 실행된다.
}
