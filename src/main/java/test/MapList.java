package test;

import java.util.*;

public class MapList {

    public static void main(String[] args) {
        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

        Map<String, Object> customersMap1 = new HashMap<>();
        customersMap1.put("name", "홍길동");
        customersMap1.put("rating", "vip");
        customersMap1.put("age", "30");
        customers.add(customersMap1);

        Map<String, Object> customersMap2 = new HashMap<>();
        customersMap2.put("name", "고기영");
        customersMap2.put("rating", "gold");
        customersMap2.put("age", "35");
        customers.add(customersMap2);

        for(Map<String, Object> customer : customers) {
            System.out.println("name=" + customer.get("name"));
            System.out.println("rating=" + customer.get("rating"));
            System.out.println("age=" + customer.get("age"));
        }
    }
}
