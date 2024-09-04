package ch06.sec10.exam02;

public class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model;
    }

    public static void main(String[] args) {
        System.out.println(Television.info);
    }
}

// 여기서 Television은 3개의 정적 필드를 가지고 있다. company와 model은 선언 시 초기값을 주었고, info는 정적 블록에서 company와 model을 연결하여
// 초기값으로 주었다.
