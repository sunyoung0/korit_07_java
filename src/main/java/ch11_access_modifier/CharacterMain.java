package ch11_access_modifier;

/*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고
    이를 CharacterMain 클래스에서 기능 테스트를 수행할겁니다.

    클래스 설계
    1. 필드
    name - 캐릭터 이름 (공개가능)
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬이름 -> 자식 클래스만
    exp - 경험치 -> 외부에서 완전 차단

    Character 클래스의 인스턴스인 warrior를 생성하고
    이름 전사
    체력 100
    공격력 200
    스킬 세로베기
    exp 30
    으로 기본 생성자를 통해 생성하고, setter를 통해서 데이터를 집어넣으시오.

    2. 메서드 정의
    getHealth() -> 체력 값을 반환하는 getter -> public / 이미 자동완성으로 만들었습니다.
    attack() -> 공격시 콘솔창에
                name 이 power로 공격!
                name 이(가) 경험치 amount을(를) 얻었습니다. -> 라고 두줄 출력되게 작성할 것 call1()유형
    heal() -> 체력을 10 회복하고, 현재 체력 출력
              체력이 10 회복되었습니다. 현재 체력 : health(숫자로 출력돼야 합니다.)
    gainExp(int amount) -> call2() 유형이고 경험치를 증가시키는 메서드(내부전용)
        실행 예
            name이(가) 경험치 amount을(를) 얻었습니다.
 */

class Character {
    // 필드 선언
    public String name;     // 공개가능
    private int health;     // 읽기만 허용
    int power;              // 같은 패키지만
    protected String skill; // 자식 클래스만
    private int exp;      // 완전 차단

    // 생성자 (캐릭터 생성시에 필수적으로 요구되는 애들만 매개변수로 받은 매개변수 생성자)
    public Character(String name, String skill, int power) {
        this.name = name;
        this.skill = skill;
        this.power = power;

        this.health = 100;      // 초기 체력(매개변수는 없죠. 객체 생성시에 무조건 체력 100으로 고정된다는 의미)
        this.exp = 0;
    }

    // 메서드 생성
    public void showInfo() {
        System.out.println("이름 " + name + "\n체력 " + health + "\n공격력 " + power + "\n스킬 " + skill  + "\n경험치 " + exp);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public String getSkill() {
        return skill;
    }

    public int getExp() {
        return exp;
    }

    // attack()
    public void attack() {
        System.out.println(name + "이(가) " + power + "의 힘으로  공격합니다 !");
        // 공격하고 나서 경헙치를 얻고 싶습니다. -> 그런데 외부에서 공격 이외의 방식으로 경험치를 강제적으로 획득하는 버그는 막고싶어요.
        // 그렇다면 위의 가이드에서 작성했던 gainExp()는 외부에서 실행되면 안됩니다.
        this.gainExp(30);
    }

    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name + "이(가) 경험치를 " + amount + " 얻었습니다.");
    }

    public void heal() {
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health);
    }

}

public class CharacterMain {

    public static void main(String[] args) {

        Character warrior = new Character("전사", "세로베기", 200);

        // warrior.name = "전사";         // field가 public 이기 때문에 타 클래스(CharacterMain)에서 직접 대입하는 것이 가능
//        warrior.setName("전사");          // 이상의 직접 대입 방식과의 코드 작성 차이점에 대해서 확인하시기 바랍니다.
//        warrior.setHealth(100);
//        warrior.setPower(200);
//        warrior.setSkill("세로베기");
//        warrior.setExp(30);

//        warrior.gainExp(1000);    gainExp()를 private 처리했기 때문에 오류 발생

        warrior.attack();
        warrior.heal();

//        warrior.showInfo();

    }

}
/*
    이상의 코드에서 여러분이 중점적으로 학습해야 할 점은
    접근 지정자의 설정 수준에 따라서 setter / getter가 필요한 사례가 있고 아닌 사례가 있다는 점입니다.
    예를 들어 겡밍르 하거나 SNS 를 한다고 쳤을 때 닉네임의 경우는 누구나 볼 수 있죠.
    그렇다면 닉네임 필드는 public 으로 설정 되어 있을겁니다.
    그렇기 때문에 getter를 통한 닉네임의 호출은 필요가 없어서 이상의 코드에서 getName() 메서드는 쓸모가 없을겁니다.

    우리는 어떤 클래스 / 필드 / 메서드를 어떤 접근 지정자를 설정해야할지도 고민해야겠습니다.

    하지만 현재 수업 상황에서는 웬만하면 필드는 private 으로 설정, getter / setter를 통한 우회 설정 및 조회를 목표로 하겠습니다.
 */
