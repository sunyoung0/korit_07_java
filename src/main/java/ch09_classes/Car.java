package ch09_classes;

public class Car {
    // 필드 선언
    String color;
    int speed;

    // 메서드 정의
    void drive() {
        System.out.println(color + " 자동차가 주행중입니다.");
    }

    void brake() {
        System.out.println(color + " 자동차가 멈췄습니다.");
    }

    void displayInfo() {
        System.out.println("이 차의 색깔은 " + color + "색이고,");
        System.out.println("최고 속도는 " + speed + "km/h 입니다.");
    }

}
