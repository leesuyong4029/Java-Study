package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet(); // HashSet 컬렉션 생성

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체의 수: " + hashSet.size());

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체의 수: " + hashSet.size());

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3); // HashSet에 Student 객체 저장
        System.out.println("저장된 객체 수: " + hashSet.size());

        // s1 객체와 s2 객체는 학생 번호와 이름이 같기 때문에 동등 객체이다. 따라서 s2가 저장이 될 때 이미 s1이 저장되어 있으므로 중복 저장되지 않는다.

    }
}
