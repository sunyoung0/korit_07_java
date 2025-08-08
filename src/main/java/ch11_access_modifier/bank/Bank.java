package ch11_access_modifier.bank;

/*
    과제 가이드 라인
    1. 필드
        accountNum(계좌번호, 정수)
        accountHolder(예금주 이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호, 4자리 정수 0 ~ 9999)

    2. 생성자
        기본생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주를 받는 생성자
        계좌번호, 예금주, 초기잔액을 받는 생성자
        계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

    3. 메서드
        1) Setter / Getter
            특히 Setter의 경우에는 유효성 검증 로직을 삽입해야함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999이하까지만 가능 -> 실패하면 "불가능한 비밀번호입니다."
        2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2()유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0 초과인지) -> 실패하면 "불가능한 입력 금액입니다."
            - 콘솔창에
                0000원 입금 성공 ! 현재 잔액 : 00000원
            withdraw(int amount, int inputPin) - > 출금 관련 메서드 / call2()유형으로 작성
              - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
              - 유효한 금액인지 검증(amount가 0 초과인지) -> 실패하면 "불가능한 입력 금액입니다."
              - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출력 불가입니다."
              - 콘솔창에
                    0000원이 출금 되었습니다. ! 현재 잔액 0000원
        3) showAccountInfo() / call1() 유형으로 작성
            - 콘솔창에
                계좌번호 : 123456
                계좌 소유자 : 홍길동
                현재 잔액 : 100000원
               라고 출력될 수 있도록 작성할 것

        전체 실행 예

        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 100000원

        계좌번호 : 987654
        계좌 소유자 : 신사임당
        현재 잔액 : 500000원

        50000원이 입금되었습니다. 현재 잔액 : 150000원        # account1에 대한 입금(오만원)
        잔액이 부족하여 출금할 수 없습니다.                   # account1에서 200000만원 출금시도 실패 사례
        100000원이 출금되었습니다. 현재 잔액 : 50000원        # account1에 대한 출금 (십만원 출금 성공)

        100000원이 출금되었습니다. 현재 잔액 : 400000원       # account2에 대한 출금
        200000원이 입금었습니다. 현재 잔액 : 600000원        # account2에 대한 입금(이십만원 입금)

        최종 계좌 정보
        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 50000원

        계좌번호 : 987654
        계좌 소유좌 : 신사임당
        현재 잔액 : 600000원

 */

public class Bank {

    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {

    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        // 0원 초과가 입금이 가능해야하므로
        if ( balance <= 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        this.balance = balance; // 이거 초기잔액 세팅이기 때문에 입금은 얘로 이뤄질수 x
    }

    public void setPinNumber(int pinNumber) {
        if ( pinNumber < 0 || pinNumber > 9999 ) {
            System.out.println("불가능한 비밀번호입니다.");
        }
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void showAccountInfo() {
        System.out.println("계좌 번호 : " + this.accountNum);
        System.out.println("계좌 소유자 : " + this.accountHolder);
        System.out.println("현재 잔액 : " + this.balance + "원\n");
    }

    public void deposit(int amount, int inputPin) {
        if ( inputPin != this.pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        if (amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        this.balance += amount;
        System.out.println(amount + "원 입금 되었습니다! 현재 잔액 : " + this.balance + "원");

        // 두 조건을 하나로 합친 강사님 코드
//        if(inputPin != pinNumber || amount <= 0) {
//            System.out.println("실패했습니다.");
//            return;
//        }

    }

    public void withdraw(int amount, int inputPin) {
        if ( inputPin != this.pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        if (amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }

        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println(amount + "원이 출금 되었습니다 ! 현재 잔액 : " + this.balance + "원");
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        }
    }

}
