package ch06.sec16;

public class Member {
    private String name;
    private String id;
    private String password;
    private int age;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Member user1 = new Member("홍길동", "hong");
        System.out.println(user1.name);
        System.out.println(user1.id);
    }
}
