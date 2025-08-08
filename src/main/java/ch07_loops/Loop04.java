package ch07_loops;

/*
    for 반복문(for loop) : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
    (while 문에는 반복 횟수를 고정시킨 상태로 시작했지만 for 문을 활용 하는 것이 더 편리함

    형식 for (시작값; 종료값; 증감값) {
                반복실행문
        }
 */

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {

        // 1부터 100까지 출력하는 for문
//        for(int i = 1; i < 101; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);    반복문 외부에서 사용 불가

        // 1부터 100까지의 합을 구하고 한번만 출력하시오. for문 사용할 것
//        int sum = 0;
//        for(int i = 0; i < 101; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 100까지 합은 " + sum);

        // 1부터 100까지 중 홀수 합을 구하는 for 문을 작성하시오.
        // 그러니까 for문 내부에 if 문을 중첩적으로 쓸 수 있다는 의미겠네요.
        // 증감값 건드려서 다른 방식으로도 풀 수 있음

//        int sum2 = 0;
//        for (int i = 0; i < 101; i++) {
//            if(i % 2 != 0) {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//
//        int sum3 = 0;
//        for (int i = 1; i < 101; i+=2) {
//            sum3 += i;
//        }
//        System.out.println(sum3);

        /*
            숫자를 입력 받아서 1부터 n까지 더하는 반복문 작성
            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum4 = 0;

        System.out.print("1부터 몇까지 더하시겠습니까? >>> ");
        num = scanner.nextInt();

        for(int i = 0; i < (num + 1); i++) {
            sum4 += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum4 + "입니다.");

    //  (n*(n+1)) /2 -> n까지 연속된 숫자의 합 더하는 공식. 굳이 반복문 쓸 필요가 없다.





    }
}
