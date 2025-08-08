package ch12_arrays;

import java.util.Arrays;

public class Array14 {

    public static void main(String[] args) {

        int[][] nums = new int[20][5];

        // 1부터 100까지의 숫자를 2차 배열에 순서대로 값을 넣으시오.
        // 즉 nums[0][0] = 1 , nums[0][1] = 2 , nums[1][0] = 6
        // 출력을
        // 1 2 3 4 5
        // ...
        // 96 97 98 99 100 으로 할 수 있게 출력문도 쓰세요. 향상된 for 문으로

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j< nums[i].length; j++) {
                // 값을 대입할 때 주소지를 두개 다 설정하신 다음에 데이터를 넣어야합니다.
                nums[i][j] += ++count;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int[] num : nums) {
            for(int number : num) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
        }

        System.out.println();

        // 2차 배열의 출력 : Arrays.deepToString(배열명);
        System.out.println(Arrays.deepToString(nums));

    }
}
