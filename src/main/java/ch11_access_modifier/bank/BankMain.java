package ch11_access_modifier.bank;

public class BankMain {

    public static void main(String[] args) {

        Bank bank1 = new Bank(123456, "홍길동", 100000, 1234);
        bank1.showAccountInfo();

        Bank bank2 = new Bank(987654, "신사임당", 500000, 1234);
        bank2.showAccountInfo();

        bank1.deposit(50000, 1234);
        bank1.withdraw(200000, 1234);
        bank1.withdraw(100000, 1234);

        System.out.println();
        bank2.withdraw(100000, 1234);
        bank2.deposit(200000, 1234);

        System.out.println("\n최종 계좌 정보");
        bank1.showAccountInfo();
        bank2.showAccountInfo();

        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank bank4 = new Bank(13579, "김사", -3000, 1234);
        bank4.showAccountInfo();
    }

}

// ch12_arrays -> Array01 클래스 -> Main