package ch07_loops;

/*
    1 2 3 ... 10
    11 12 13 ... 20
    ...
    91 ... 100 으로 출력되게

    1. 반복문을 100번 돌리는 방법
    2. 반복문을 10번 돌리는 방법
 */

public class Loop02 {
    public static void main(String[] args) {
        int i = 0;

        // 1번 풀이
        while (i < 100) {
            ++i;
            System.out.print(i + " ");

            if(i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        // 2번 풀이
        // 힌트 : 1 2 3 ... 10 을 출력하는게 한번의 반복
        // 힌트2 : 첫번째 라인의 변수가 1로 시작하는데 두번째 라인은 11로 시작
        int  j = 1;

        while (j < 101) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3) + " " +(j+4)
                                + " " +(j+5) + " " +(j+6) + " " +(j+7) + " " +(j+8) + " " +(j+9));
            j+=10;
        }


    }
}
