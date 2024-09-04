package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() { return no; }
    public String getName() { return name; }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    // 만약 hashCode()를 저장하지 않으면 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다. 그러므로 위 코드를 주석처리하면 실행결과가 달라진다.


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student target) {
            if(no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
