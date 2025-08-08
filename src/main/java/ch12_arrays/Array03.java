package ch12_arrays;

import java.util.Scanner;

/*
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1번 학생의 이름을 등록하세요 >>> 김일
    김일 학생의 점수를 입력하세요 >>> 4.5
    2번 학생의 이름을 등록하세요 >>> 김이
    김이 학생의 점수를 입력하세요 >>> 4.4
    3번 학생의 이름을 등록하세요 >>> 김삼
    김삼 학생의 점수를 입력하세요 >>> 4.3
    4번 학생의 이름을 등록하세요 >>> 김사
    김사 학생의 점수를 입력하세요 >>> 4.2
    5번 학생의 이름을 등록하세요 >>> 김오
    김오 학생의 점수를 입력하세요 >>> 4.1

    김일 김이 김삼 김사 김오
    4.5 4.4 4.3 4.2 4.1

    학생들의 점수 총합은 21.5점입니다.

 */
public class Array03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int num = scanner.nextInt();

        String[] names = new String[num];
        double[] scores = new double[num];

        double sum = 0;

        for(int i = 0; i < names.length; i++) {

            System.out.print((i+1) + "번 학생의 이름을 등록하세요. >>> ");
            names[i] = scanner.next();
            System.out.print(names[i] + " 학생의 점수를 입력하세요. >>> ");
            scores[i] = scanner.nextDouble();

            sum += scores[i];
        }

        System.out.println();

        // 각 배열의 element를 출력하는 반복문 작성할 필요 -> names 출력 후에 개행이 이루어지고 그 다음 scores가 출력

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
        System.out.println("\n학생들 점수의 총합은 " + sum + "점입니다.");

    }

}
