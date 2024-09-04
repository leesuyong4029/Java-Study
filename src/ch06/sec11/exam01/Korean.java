package ch06.sec11.exam01;

public class Korean {
    // 인스턴스 final 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-1234567", "이자바");

        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final 필드는 값을 변경할 수 없음
        // k1.nation = "USA";
        // k1.ssn = "123-12-1234";

        // final이 아닌 필드는 값이 변경 가능하다.
        k1.name = "김자바";
    }
}
