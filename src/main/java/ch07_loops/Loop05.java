package ch07_loops;

/*
    중첩 for 문도 가능
    for (int i = 0; i < 100; i++) {
        반복실행문1-a
        for (int j = 0; j < 100; j++){
            반복실행문2
        }
        반복실행문 1-b
    }

    for 문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시입니다. 까지 출력하시오.
    구구단 for문 활용하여 출력하시오.
 */

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {

//        for (int i = 1; i < 6; i++) {
//            for (int j = 1; j < 4; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }
//
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " X " + j + " = " + (i * j));
//            }
//        }

    /*
        1 2 3 ...10
        11 ... 20
        91 ... 100
     */

//        for (int i = 1; i < 101; i++) {
//            System.out.print(i + " ");
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }

//        for (int i = 1; i < 101; i+=10) {
//            System.out.println(i+  " " + (i+1) + " " + (i+2) + " " + (i+3) + " " + (i+4) + " "
//                                + (i+5) + " " + (i+6) + " " + (i+7) + " " + (i+8) + " " + (i+9) + " ");
//        }


        /*
            숫자를 입력받아서 n까지 더하는 반복문을 for 문으로 작성하시오
            실행예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지 의 합은 55입니다.

            1부터 n 까지의 숫자 중 짝수의 합을 도출하시오.
         */

        Scanner scanner = new Scanner(System.in);

        // 내코드
//        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
//        int num = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = 0; i < (num+1); i++) {
//            sum += i;
//        }
//        System.out.println("1부터 " + num +  "까지의 합은 " + sum + "입니다.");
//
//
//        System.out.print("1부터 몇까지 짝수합을 구하시겠습니까? >>> ");
//        int num2 = scanner.nextInt();
//
//        int sum2 = 0;
//        for (int i = 0; i < (num2+1); i++) {
//            if(i % 2 == 0) {
//                sum2 += i;
//            }
//        }
//        System.out.println("1부터 10까지 짝수의 합은 " + sum2 + "입니다.");

        // 강사님 코드 : 두개를 한번에 정리
        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        int num = scanner.nextInt();

        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < (num+1); i++) {
            sum += i;

            if(i % 2 == 0) {
                sumEven += i;
            }
            else {    // 강사님 코드
                sumOdd += i;
            }

            // 내코드
//            if(i % 2 != 0) {
//                sumOdd += i;
//            }
        }
        System.out.println("1부터 " + num +  "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 " + num + "까지 짝수의 합은 " + sumEven + "입니다.");
        System.out.println("1부터 " + num + "까지 홀수의 합은 " + sumOdd + "입니다.");
    }
}
