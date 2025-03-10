public class Mathod {
    public static void main(String[] args) {
        // 메서드없이 홀짝을 구분하는 코드
        int num = 4;
        String str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 5;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 6;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 7;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 8;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 9;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        num = 10;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        // 메서드의 사용, 호출 (= call method)

        System.out.println("메서드의 reuturn");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));



    }

    // 메서드의 선언 , 정의
    public static void checkOddEven(int number) {
        int num = 4;
        String str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);


    }

    public static String checkOddEven2(int number){
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        return str;
    }
}
