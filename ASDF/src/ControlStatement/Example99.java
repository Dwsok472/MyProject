package ControlStatement;

import java.util.Scanner;

public class Example99 {
    public static void main(String[] args) {
        // 입력받은 숫자의 제곱을 리턴하는 메서드
        System.out.println(square());
    }
    public static int square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int number = scanner.nextInt();
        scanner.close();
        return number * number;
    }
}