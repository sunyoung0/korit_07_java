package ch12_arrays;

/*
    메서드를 정의해도 되고 main에 바로 하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */

import java.util.Scanner;

public class Array05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] scores = new String[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("점수를 입력하세요 >>> ");
            scores[i] = scanner.next();
        }

        for(int i = 0; i <(scores.length - 1); i++) {
            System.out.print(scores[i] + "+ ");
        }
        System.out.print(scores[scores.length - 1]);



    }

}
