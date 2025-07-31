package ch07_loops;

/*
    중첩 while문(Nested - while)
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복 실행문1-b
    }
 */

public class Loop03 {
    public static void main(String[] args) {
        int day = 1;
        // 1일차 1교시입니다. ~ 1일차 3교시입니다.
        // 2일차 1교시 입니다. ~ ...
        // 5일차 1교시 입니다. ~ 5일차 3교시입니다.
//        while(day < 6) {
//            int lesson = 1;     // 반복실행문 1-a에 해당. 변수의 선언 및 초기화
//            while (lesson < 4) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");    // 반복실행문2
//                lesson++;
//            }
//            day++;      // 반복 실행문 1-b
//        }

        //System.out.println(lesson);   반복문 외부에서 쓰지 못함
        // scope(범위)라는 것으로, 전역(전체영역) / 지역으로 나뉜다는 점이 중요

        /*
            이상의 코드를 활용하여
            2 x 1 = 2
            2 x 2 = 4
            ...
            9 x 9 = 81
            을 출력하시오.

         */

        int dan = 2;

        while (dan < 10) {
            int num = 1;
            while (num < 10) {
                int result = dan * num;
                System.out.println(dan + " x " + num + " = " + result);
                num++;
            }
            dan++;
        }
    }
}