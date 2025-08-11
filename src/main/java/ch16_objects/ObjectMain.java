package ch16_objects;

public class ObjectMain {
    public static void main(String[] args) {
        // 객체생성
        ObjectTest objectTest1 = new ObjectTest();

        objectTest1.setName("홍길동");
        objectTest1.setAddress("부산광역시 중구");

        objectTest1.showInfo();

        System.out.println(objectTest1);
        // objectTest1.toString() -> toString 불필요한 메서드라고 뜸 객체명 만으로 toString 호출 가능

        String example = "안녕하세요.";

        boolean result1 = "안녕하세요." == example;
        System.out.println(result1);    // true

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];   // true
        boolean result3 = example == strArray[0];   // false

        System.out.println(result2);
        System.out.println(result3);

        String example2 = new String("안녕하세요");
        boolean result4 = "안녕하세요" == example2;  // false
        System.out.println(result4);

        boolean result5 = strArray[0] == example2;
        System.out.println(result5);    // false

        boolean result6 = strArray[0].equals(example2);
        System.out.println(result6);    // true

    }
}
