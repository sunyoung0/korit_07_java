package ch06_condition;

/*
    중첩 if문(Nested - if) : if 문 내에 if 문이 중첩적으로 사용될 수 있습니다.
    형식 : if (조건식1) {
            실행문1
            if(조건식1a) {
               실행문1a
            } else if(조건식1b) {
                   실행문1b
            } else if(조건식1c) {
                   실행문1c
            } else {
                실행문1d
            }
          } else if (조건식2) {
                실행문2
                if (조건식2a) {
                    실행문2a
                } else if (조건식2b)
                    조건식2b
                } else {
                    실행문2c
                }
          } else {
            실행문3
          }
 */

import java.util.Scanner;

public class Condition07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";

        System.out.print("점수를 입력하세요 >>> ");
        score = scanner.nextInt();

        // 중첩 if 문을 활용한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 입력입니다.");       // 실행문1
            grade = "X";
        } else {    // 위가 실행이 안됐다면 score는 0이상 100이하 라는 의미
            if (score > 89) {           //조건식2a
                grade = "A";
            } else if (score > 79) {    //조건식2b
                grade = "B";
            } else if (score > 69) {    //조건식2c
                grade = "C";
            } else if (score > 59) {    //조건식2d
                grade = "D";
            } else {                    //조건식2e
                grade = "F";
            }
        }
        System.out.println("당신의 점수는 " + score +"점이고, 학점은 " + grade + "입니다.");
    }
}
