package ch06_condition;

/*
    if - else 문 : if 다음에 있는 조건식이 true일 때는 if 문 내의 {} 실행문이 실행됨
                   false 인 경우에는 else에 딸린 {} 실행문이 실행
                   형식 - if (조건식) {
                            실행문1
                         } else {           else의 경우 if가 false일 때만 실행되기 때문에 if 에서처럼 조건식이 존재하지 않음
                            실행문2
                         }

 */

public class Condition02 {
    public static void main(String[] args) {

        int num1 = 0;

        if (num1 > 0) {     // 현재 무조건 false 이니까
            System.out.println("num1은 양수입니다.");
        } else {            // else에 딸린 실행문2가 출력됨
            System.out.println("num1은 0이거나 음수입니다.");
        }

        // Condition03 -> main
    }
}
