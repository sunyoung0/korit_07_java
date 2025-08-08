package ch09_classes.products;

public class ProductMain {

    public static void main(String[] args) {

        // 객체 생성 방법 클래스명 객체명 = new 생성자;
        // 기본 생성자를 통한 생성
        Product product1 = new Product();
        // 매개변수 생성자를 통한 생성(RequiresArgsConstructor)
        Product product2 = new Product(9876564);
        Product product3 = new Product("USB-C 케이블");
        // 매개변수 생성자를 통한 생성(AllArgsConstructor)
        Product product4 = new Product(951753, "GFlip6");

        product1.productNum = 123456;
        product1.productName = "LG엘패드";

        product2.productName = "다이소충전기";

        product3.productNum = 159357;

        product4.productNum = 951753;
        product4.productName = "GFlip6";

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

        // ch09_classes -> ReviewMethod 클래스 생성

    }

}
