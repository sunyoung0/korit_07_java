package ch06_condition;

/*
    고민해봐야 할 사항
    Condition05의 코드는 100 초과 / 0 미만의 점수가 입력 됐을 때 각각 A / F 라는 결과값이 나오게 됨
    애초에 잘못된 점수를 입력했을 때 불가능한 점수 입력이라고 안내를 하려면 어떻게 할 수 있을까
    100 초과 / 0 미만의 경우 grade를 X라고 함

    참고사항 : 선수 학습 하신 분들 중첩 if 문을 사용하지 않고 작성하겠습니다.
 */

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");

        int score = scanner.nextInt();
        String grade = "";

        if (score > 100 || score < 0) {
            grade = "X";
        } else if (score > 89) {
            grade = "A";
        } else if (score > 79) {
            grade = "B";
        } else if (score > 69) {
            grade = "C";
        } else if (score > 59) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는 " + score +"점이고, 학점은 " + grade + "입니다.");

        // Condition07
    }
}
