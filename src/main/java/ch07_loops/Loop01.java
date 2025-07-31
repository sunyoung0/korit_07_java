package ch07_loops;

/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사합니다.
    즉, while() 내의 조건식이 true일 때, {} 내의 실행문이 '반복적으로 이루어집니다.

    그래서 주의할 점
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 설계를 해둘 필요가 있음

    false가 되는 시점을 지정해주지 않는다면 계속 true 상태가 유지되어
    반복 실행문이 무한히 계속되기 때문에 무한 루프라는 표현을 씀
 */

public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 예시
//        int i = 1;
//        while (i < 101) {
//            System.out.println(i);
//            i++;            // i를 증가시켜서 24번라인이 특정 시점에 조건이 false가 되도록 지정
//        }
//
//        int j = 0;
//        while (j <100) {
//            System.out.println(++j);
//        }

        // 그래서 1부터 100까지의 합을 구하는 방식
        int num1 = 1;
        int sum = 0;
        // 을 이용하여 1부터 100까지의 합을 구하시오 (for 문을 쓰지말고 작성)

//        while(num1 < 101) {
//            sum = sum + num1;
//            num1++;
//        }
//        System.out.println(sum);

        while(num1 < 101) {
            sum += num1++;
        }
        System.out.println("최종 합계 = " + sum);

        int sum2 = (100 * 101) /2;
        System.out.println("등차수열의 합계 공식 이용 : " + sum2);

        /*
            사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는 것 자체가 오히려 비효율적이라는 사실을 49-50라인에서 확인 가능

            하지만 while문 자체는 Java 문법이고, if 에서와 동일하게 중첩적으로 사용이 가능
            그리고 while 문 내부에 if 문이 들어가는 등의 응용도 가능

            예를 들어, '공차가 2이고 a1이 0인 수열의 a50까지의 합을 구하시오'
            와 같은 문제가 나온다고 가정했을 때, 그때는 49번 라인의 공식 적용이 불가능하고,
            우리는 공차가 2인 등차수열의 합 공식 같은건 몇년전에 까먹음.
         */

        int j = 0;
        int sum3 = 0;
        // 정석 버전
//        while (j < 101) {
//            if (j % 2 == 0) {
//                sum3 += j;
//            }
//            j++;
//        }
//        System.out.println(sum3);

//        while (j < 101) {
//            sum3 += j;
//            j+=2;
//        }
//        System.out.println(sum3);

        /*
            1부터 100까지
            1
            2
            ...
            100
            으로 출력하는 것은 위에 예시가 나와있습니다.
            1 2 3 ... 100 으로 출력하시오
         */

        // 내풀이
        int k = 1;
        while (k < 101) {
            System.out.print(k + " ");
            k++;
        }

        System.out.println();

        // 강사님 풀이
        int k2 = 0;
        while (k2 < 100) {
            System.out.print(++k2 + " ");
        }
    }
}
