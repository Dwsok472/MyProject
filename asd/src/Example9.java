import java.util.Scanner;

public class Example9 {
        public static void main(String[] args) {
            // 입력받은 숫자의 제곱을 리턴하는 메서드
            System.out.println(square());
        }
        public static int square(){
            Scanner nam = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 :");
            int number = nam.nextInt();
            nam.close();
            return number * number;

        }
    }

