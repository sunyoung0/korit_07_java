package ch20_collections;

import java.util.*;

public class FieldTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            1. 학생의 수를 입력받아 해당 횟수만큼 반복문을 돌릴 것.
            2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
            3. 중복을 제거하기 위해여 fieldTripSet에 이상의 List의 element 들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List 로 재이동하여 finalFieldTrips List 에서 element 들을 추출하여 작성할 것

            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? 5명
            1번 학생의 수학 여행지를 입력하세요 >> 제주
            2번 학생의 수학 여행지를 입력하세요 >> 제주
            3번 학생의 수학 여행지를 입력하세요 >> 민속촌
            4번 학생의 수학 여행지를 입력하세요 >> 민속촌
            5번 학생의 수학 여행지를 입력하세요 >> 제주

            1번 학생의 후보지 : 제주
            2번 학생의 후보지 : 제주
            3번 학생의 후보지 : 민속촌
            4번 학생의 후보지 : 민속촌
            5번 학생의 후보지 : 제주

            수학 여행 후보지는
            제주
            민속촌
            입니다.
         */

        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> ");
        int student = scanner.nextInt();

        List<String> fieldTrips = new ArrayList<>();
//        String trip = "";   // 최종 결과 얘는 fieldTrips List의 맨 마지막 element 와 동일한 값을 가지게 됨 -> 반복문에 지역변수로 선언
        for (int i = 0; i < student; i++) {
            System.out.print((i+1) + "번 학생의 수학 여행지를 입력하세요 >>> ");
            String trip = scanner.next();
            fieldTrips.add(trip);
        }

        System.out.println();

        for ( int i = 0; i < fieldTrips.size(); i++) {
            System.out.println((i+1) + "번 학생의 후보지 : " + fieldTrips.get(i));
        }

        Set<String> fieldTripSet = new HashSet<>();
        fieldTripSet.addAll(fieldTrips);

        List<String> finalFieldTrips = new ArrayList<>();
        finalFieldTrips.addAll(fieldTripSet);

        Collections.sort(finalFieldTrips, Comparator.reverseOrder());

        System.out.println();

        System.out.println("수학 여행 후보지는 ");
        for(int i = 0; i < finalFieldTrips.size(); i++) {
            System.out.println(finalFieldTrips.get(i));
        }
        System.out.println("입니다.");
    }
}
