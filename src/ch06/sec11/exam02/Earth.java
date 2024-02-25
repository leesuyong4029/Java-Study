package ch06.sec11.exam02;

public class Earth {
    // 상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    // 상수 선언
    static final double EARTH_SURFACE_AREA;

    // 정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
        // Math.PI는 자바에서 제공하는 상수이다.
    }

    public static void main(String[] args) {
        // 상수 읽기
        System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
    }
}
