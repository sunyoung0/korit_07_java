package ch00_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

    public static void main(String[] args) {
        // 처음 Generic이 도입됐을 때는 선언했을 때, 생성자 호출했을 때 둘 다 자료형을 명시했어야하나
        // 업데이트 되면서 선언하는 부분에만 적어주면 됩니다.
//        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        // List의 element로 Map 자료형이 들어감.
        List<Map<String, Object>> customers = new ArrayList<>();
        /*
            이상의 코드에서 Key는 String 이고 Value는 Object로 되어있는 것을 확인할 수 있습니다.
            하지만 여러분들은 .put("name","홍길동") 을 넣더라도 문제가 없었을겁니다.
            이유 -> "홍길동"은 String / 30은 Integer로 두 클래스 다 Object의 서브 클래스이기 때문

            실행 예
            name=홍길동
            rating=vip
            age=30
            name=고기영
            rating=gold
            age=35
         */

        // 빈 Map 2개를 선언하고, 각각 value를 삽입
        Map<String, Object> customer1 = new HashMap<>();
        customer1.put("name","홍길동");
        customer1.put("rating", "vip");
        customer1.put("age", 30);

        Map<String, Object> customer2 = new HashMap<>();
        customer2.put("name","고기영");
        customer2.put("rating", "gold");
        customer2.put("age", 35);

        // List에 방금 만든 Map 자료를 더해야합니다.
        customers.add(customer1);
        customers.add(customer2);

        // 출제 의도는 entrySet을 사용하는거였습니다.
        for (Map<String, Object> customer : customers) {
            // List의 내부 Element로 들어왔습니다.
            // 그런데 MAp의 내부에는 3쌍의 Entry가 있다고 할 수 있겠네요.
            for (Map.Entry <String, Object> entry : customer.entrySet()) {
                // 그러면 이제 각각의 Entry를 반복하게 됩니다.
                System.out.println(entry);
            }
        }
    }
}