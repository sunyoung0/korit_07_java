package ch16_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    // 기본 생성자 / AllArgsConstructor를 정의하시오.

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter / setter 를 정의하시오.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // showInfo를 call1() 형식으로 정의하시오.
    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("주소 : " + this.address);
    }

    /*
        실행 예
        이름 : 홍길동
        주소 : 부산광역시 중구

        Main 으로 가서 objectTest1 에
        이름 주소를 set 하고
        showInfo()를 호출하시오.
     */

    @Override
    public String toString() {
        return "ObjectTest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
