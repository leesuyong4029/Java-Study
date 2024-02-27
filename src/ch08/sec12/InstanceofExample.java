package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // ride() 메서드 호출 시 구현객체를 매개변수값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스를 매개변수로 가지는 메서드
    public static void ride(Vehicle vehicle) {
//        if(vehicle instanceof Bus) {
//            Bus bus = (Bus) vehicle; // 매개변수값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메서드를 호출
//            bus.checkFare();
//        }

        if(vehicle instanceof Bus bus) { // Java12부터 사용가능
            bus.checkFare();
        }

        vehicle.run();
    }


}
