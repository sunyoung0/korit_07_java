package ch02_variable;

/*
    주석(comment) : Java 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데,
                    거기서 오류가 하나라도 발생하게 되면 전체 프로그램이 실행 X
                    하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
                    오류가 발생하지 않음.

                    즉 주석이랑 컴퓨터가 읽어서 처리하는 부분이 아니라
                    사람이 읽어서 정보를 얻을 수 있는데 의의가 있음

                    1) 한줄 주석 : //
                    2) 다중 주석 : / + 별표 + enter
                    3) 사후 주석 : 주석 처리할 부분의 코드라인에서 ctrl + /
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
//        System.out.println(안녕하세요); -> 오류발생
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");

        /*
            이상과 같은 방식의 코드 대입을(매번 데이터를 직접 사용하는 방식) 하드코딩이라는 표현을 씀
            하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 이를 리터럴(Literal)을 바로 집어넣는 것으로,
                       '지양'되는 방식.
            그렇다면 권장되는 방식은 데이터를 '변수'에 대입하고, 변수를 통해서 명령을 내리는 방식

            변수(variable) : 데이터를 담는 바구니 -> 이름을 달아줘야 함.
            변수 선언 방법 : 자료형 변수명 = 데이터;
         */

        int scoreEnglish = 100;             // 변수 선언 및 초기화
        System.out.println(scoreEnglish);   // sout -> 출력문

        int koreanScore;        // 변수선언
        koreanScore = 99;       // 초기화

        String introduction = "안녕하세요.";
        System.out.println(introduction + " 앞으로 잘 부탁드립니다.");

        /*
            Java에서의 변수 명명 규칙 :
                1. 카멜 표기법(camel case) 사용
                    : 첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우 두번째 단어의 첫번째 문자만 대문자
                    ex) 한단어짜리 : result , 복수단어 : myTestResult
                2. 특수문자 지양

                cf) python 학습하신 분들의 경우 python 변수 표기 방식은 스네이크 표기법
                (snake case)라고 해서 my_test_result 와 같은 방식으로 작성
         */

        System.out.println(scoreEnglish);
        // 변수 - 값이 바뀔 수 있음
        scoreEnglish = 90;                  // 재대입할 때는 자료형 명시 X
        System.out.println(scoreEnglish);

        // 자료형 수업
        // 1. 논리 자료형(boolean) 변수 : 참 / 거짓 (true / false)
        // 자료형 변수명 = 데이터(값);        변수의 선언 및 초기화
        boolean checkFlag1 = false;
        checkFlag1 = true;          // 재대입

        // 2. 문자 자료형 변수 char
        char name1 = '박';
        char name2 = '선';
        char name3 = '영';
        System.out.println(name1+name2+name3);  // 결과값 : 148278
        System.out.println('박'+'선'+'영');  // 결과값 : 148278

        System.out.println("" + name1 + name2 + name3); // 결과값 : 박선영

        /*
            이상의 코드에서 알 수 있는 점은 컴퓨터가 생각보다 멍청하다.
            개발자가 하나하나 지정을 해줘야 한다는 점
            '문자'와 '문자열'은 서로 다른 개념인데,
            문자(하나짜리)를 세 번 더했을 경우에는 더이상 문자가 아니라 문자열로 인식되기 때문에
            원하는 방식으로 출력되지 않는다.

            그렇기 때문에 73번 라인에서 sout()의 () 내부에 ""를 넣어주니까 원하는 결과값을 얻을 수 있었음

            즉 작은 따옴표('')는 '문자'를 표시하기 위한 기호
               큰 따옴표("")는 "문자열"을 표시하기 위한 기호
            근데 python이랑 javascript에서는 이런 구분이 없음

            그리고 sout()의 ()내부에서 가장 먼저 나온 데이터의 자료형을 따라간다는 점도 확인 가능

            현재 개념 : 하나짜리 문자가 여러개 모이면 문자열
            char : 문자
            String : 문자열
         */

        char name4 = '김';
        String name5 = "철수";

        System.out.println(123 + 1);    // 결과값 : 124
        System.out.println("123" + 1);  // 결과값 : 1231
        System.out.println(123 + "1");  // 결과값 : 1231 근데 얘가 예외적임

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);    // 숫자 변수는 연산이 가능함

        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4);    // 300400
        // 문자열은 연산이 아니라 "나열"됨

        // 문자열은 '순서'가 중요
        // 나중에 배울텐데 대문자로 시작하는 Integer가 있음
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6);

        // 4. 실수 자료형 변수 double
        double pi = 3.1415926;
        // int pi = 3.14;  // 오류발생
        // 정수 / 실수 자료형은 수학 연산이 가능

        /*
            + : 더하기
            - : 빼기
            * : 곱하기
            / : 나누기
            % : 나머지

            문제 : pi 변수를 활용하여 원의 반지름이 43인 원의 둘레 및 넓이를 구하시오.
                  원의 둘레 - 지름 X pi  원의 넓이 - 반지름 제곱 x pi

        */

        System.out.println(pi * 43 * 2);
        System.out.println(pi * 43 * 43);

        // 문자열의 경우에는 + 연산만 가능함
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 It 아카데미 강사";
        String previousJob = "영어교사";

        System.out.println("안녕하세요. 제 이름은 " + name + "입니다. 제 전공은 " + major + "이고 " +
                "그래서 제 예전직업은 " + previousJob +"였습니다. 현재는 " + currentJob+ "을 가지고 있습니다.");

        // 이상의 코드에서 알 수 있는 점은 변수 + literal의 형태로도 작성이 가능하다는 점입니다.

        // 변수 선언
        String name10;
        String major10;
        String mbti10;
        int age10;

        /*
            위에 선언한 변수들을 적합한 데이터로 '초기화'하여
            '저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 누구누구입니다. ?? 살입니다.
            제 전공은 ㅁㅁ학과이며, mbti는 ㅁㅁ입니다. 열심히 할게요!!!'
            와 같이 출력될 수 있도록 sout을 작성하시오.
         */

        // 초기화
        name10 = "박선영";
        major10 = "정보통신과";
        mbti10 = "ISFP";
        age10 = 26;

        // sout 두번 써서 개행하는 방법
        System.out.println("저는 코리아 it 아카데미 7월 국비 과정을 수강하고 있는 " + name10 + "입니다. " + age10 + "살입니다.");
        System.out.println("제 전공은 " + major10 + "이며, mbti는 " + mbti10 + "입니다. 열심히 할게요!!!");

        // sout 한번 써서 개행하는 방법
        System.out.println("저는 코리아 it 아카데미 7월 국비 과정을 수강하고 있는 " + name10 + "입니다. " + age10 + "살입니다." + "\n" + "제 전공은 " + major10
                            + "이며, mbti는 " + mbti10 + "입니다. 열심히 할게요!!!");

        // 엔터키 위에 원화표시가 있음. 원화표시가 한국에서 만 먹히는 형태고 원래는 역슬러시만 표기되어 있음
        // \n -> 개행이 일어남
        // \t -> 탭 친 효과가 일어남

        // ch03_operator 패키지 생성 -> Operator01 클래스를 생성 -> main도 적용
    }
}
