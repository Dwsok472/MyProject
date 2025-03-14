package ControlStatement;

public class Example22 {
    public static void main(String[] args) {
        // 다양한 메서드 만들어보기
        String str = "Hello";
        int length = str.length();
        System.out.println(length);
        // 문자열의 길이를 반환하는 메서드
        // (문제) 아래 코드가 작동하도록 메서드를 만드시오.
        System.out.println(getLength("Hello World")); // 11
        System.out.println(getLength("Please help me")); // 14
        System.out.println(getLength("Happy birthday")); // 14
    }

    public static int getLength(String str) {
        return str.length();
    }


}