package ch07_loops;

/*
    중첩 for문(Nested for) - loop
    for (시작값; 한계값; 증감값) {
        반복실행문1-a
        for (시작값; 한계값; 증감값) {
            반복실행문2
        }
        반복실행문1-b
        for (시작값; 한계값; 증감값) {
            반복실행문3
        }
        반복실행문1-c
    }

    *
    **
    ***
    ****
    *****
    고려사항 : 반복은 몇번 이루어지는가?
    무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
    왜 라인마다 별의 갯수가 달라지는가?
 */

public class Loop06 {
    public static void main(String[] args) {

//        for(int i = 0; i < 6; i++) {
//            for(int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*
            별찍기를 통한 for문 구조 학습
                    i = 0, j = 0 일 때는 두번째 for 문이 작동 안하기 때문에 개행만. 별X
            *       i = 1, j = 0 일 때는 별 하나 찍히고, i = 1/ j = 1일 때 false
            **      i = 2, j = 0,1 일 때는 별이 두개
            ***     i = 3, j = 0,1,2 일 때는 별이 세개
            ****    i = 4, j = 0 ,1,2,3 일 때는 별이 네개
            *****   i = 5, j = 0,1,2,3,4 까지 다섯개의 별이 찍히고 종료
                    종료되고 나서 개행이 이루어지기 때문

            *****
            ****
            ***
            **
            *
         */

        // 1. 첫번째 for 문은 개행을 담당하는 것이기 때문에 굳이 5 4 3 2 1 안함
        for(int i = 0; i < 6; i++) {
            for(int j = 5; j - i > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. i가 5부터 시작해서 좁히는 방법
        for(int i = 5; i > 0; i--) {
            for(int j = 0; i - j > 0; j++){     // 강사님 코드 한계값 : j < i
                System.out.print("*");
            }
            System.out.println();
        }

        // 번외문제 -> 100부터 1까지 역순으로 출력하시오.
        for(int i = 100; i > 0; i--){
            System.out.println(i);
        }
    }
}
