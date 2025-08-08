package ch09_classes;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
        저희는 call1() - call4()로, 매개변수 유무 / return 유무로 구분했습니다.

    형식 :
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
            메서드 내부에서 순차적으로 실행될 코드들 -> 이 묶음을 비즈니스 로직이라고 하기도 합니다.
        }
    정의 예시 :
        public void writeSchedule(String date, String content) {
             System.out.println(date + "일의 스케쥴은 다음과 같습니다." );
             System.out.println(content);
        }

    호출 예시 :
        객체명.writeSchedule("20250804", "메서드/ 오버로딩 / 클래스 복습");
 */

import java.util.Scanner;

public class ReviewMethod {
    // 메서드 정의 영역
    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케쥴은 다음과 같습니다." );
        System.out.println(content);
    }
    // 1. writeSchedule을 overloading 하여 매개변수1의 자료형을 int로 바꾸고
    // writeSchedule(20250805, "클래스/getter/setter 예습")을 호출하시오.

    // 2. call2() 유형으로 작성할겁니다.  -> main에 어떻게 쓸 지 고민
    // dividedBySeven 메서드를 정의할겁니다.
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드를 작성하시오.
    // 실행 예
    // 임의의 숫자를 입력하세요 >>> 77
    // 77은 7의 배수입니다.
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다.
    // 다한사람은 오버로딩으로 call1() 유형으로도

    // 오버로딩 메서드명은 동일 , 매개변수의 갯수나 데이터타입이 다름
    public void writeSchedule(int date, String content) {
        System.out.println(date + "일의 스케쥴은 다음과 같습니다." );
        System.out.println(content);
    }

    public void dividedBySeven(int number) {
        // 지역 변수 선언
        String answer = "";
        if (number % 7 == 0) {
            answer = "7의 배수 입니다.";
        } else {
            answer = "7의 배수가 아닙니다.";
        }
        System.out.println(number + " 은(는)" + answer);
    }

    public void dividedBySeven () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int number = scanner.nextInt();     // 이거 method의 return 값이 num이라는 변수에 저장되는 것이다.

        if (number % 7 == 0) {
            System.out.println(number + "은 7의 배수입니다.");
        } else {
            System.out.println(number + "은 7의 배수가 아닙니다.");
        }

        // method 내부에서 다른 method를 호출하는 것이 가능하다.
        // 66 - 70 라인을 적지 않고 위에 작성한 메서드를 호출해서 작성하는 것이 가능
        // dividedBySeven(number);
    }

    public static void main(String[] args) {
        // 현재 dividedBySeven()의 call2() 유형은 7의 배수인지 아닌지만 체크합니다.
        // 그리고 argument가 필수적으로 요구되기 때문에
        // main 에서 Scanner를 import 해야합니다.
        Scanner scanner = new Scanner(System.in);

        // 메서드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
        reviewMethod.writeSchedule("20250804", "메서드/ 오버로딩 / 클래스 복습");

        reviewMethod.writeSchedule(20250805, "클래스/getter/setter 예습");

        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int number = scanner.nextInt();

        reviewMethod.dividedBySeven(number);
        reviewMethod.dividedBySeven();  // 이 경우에는 매개변수가 없기 때문에 메서드 내에서 변수를 사용해야함.

    }

}
