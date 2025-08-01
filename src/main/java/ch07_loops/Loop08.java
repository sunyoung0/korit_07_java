package ch07_loops;

/*
    1번 문제
         *
        **
       ***
      ****
     *****

    2번문제
     *****
      ****
       ***
        **
         *
 */

public class Loop08 {
    public static void main(String[] args) {

        // 1번 문제
        // 개행을 책임지는 for문
        for (int i = 0; i < 6; i++) {
            // 공백을 책임지는 for문
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            //별을 책임지는 for문
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 2번 문제
        // 개행을 책임지는 for문
        for (int i = 0; i < 6; i++) {
            // 공백을 책임지는 for문
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //별을 책임지는 for문
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 강사님 코드
        // 1번 문제

//        for (int i = 0; i < 6; i++) {
//            // 공백을 책임지는 for문    -> 공백은 줄어들어야 함.
//            for (int j = 5; j > i; j--) {
//                System.out.print(" ");
//            }
//
//            // 별을 책임지는 for문      -> 별은 늘어나야함
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // 2번 문제
//        for (int i = 0; i < 6; i++) {
//            // 공백을 책임지는 for문      -> 공백은 늘어나야함
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            // 별을 책임지는 for문    -> 별은 줄어들어야 함.
//            for (int k = 0 ; k < 5 - i ; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

    }
}
