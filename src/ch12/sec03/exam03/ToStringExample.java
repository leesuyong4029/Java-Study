package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString(); // toString() 메소드 호출
        System.out.println(strObj);

        System.out.println(myPhone); // toString() 메소드 호출
    }
}

// System.out.println() 메소드는 매개값이 기본 타입(byte, short, int, long, float, double, boolean)이거나 문자열일 경우 해당 값을 그대로 출력한다.