package ch06.sec07;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model){
        // 20라인 생성자 호출
        this(model, "은색", 250);
        // this(매개값, ...)는 생성자의 첫 줄에 작성되며, 다른 생성자를 호출하는 역할을 한다.
        // 호출하고 싶은 생성자의 매개변수에 맞게 매개값을 제공하면 된다. this() 다음에는 추가적인 실행문을 작성할 수 있는데,
        // 호출되는 생성자의 실행이 끝나면 원래 생성자로 돌아와서 다음 실행문을 실행하면 된다.
    }

    Car(String model, String color) {
        // 20라인 생성자 호출
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model; // 공통 초기화 코드
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

// 생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있다. 매개변수의 수만 달리 하고 필드 초기화 내용이 비슷한 생성자에서 이러한 중복
// 코드를 많이 볼 수 있다.
// 이 경우에는 공통 코드를 한 생성자에만 집중적으로 작성하고, 나머지 생성자는 this(...)를 사용하여 공통 코드를 가지고 있는 생성자를 호출하는 방법으로 개선할 수 있다.
