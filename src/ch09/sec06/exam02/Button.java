package ch09.sec06.exam02;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        // 추상 메서드
        void onClick();

    }
        // 필드
        private ClickListener clickListener;

        // 메서드
        public void setClickListener(ClickListener clickListener) { // ClickListener 구현 객체
            this.clickListener = clickListener;
            // 왼쪽 clickListener는 필드를 의미하고, 오른쪽 clickListener는 매개변수로 들어온 구현 객체를 말한다. 외
        }
}

