import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = new String ("하이");
        System.out.println("나이를 입력해주세요");
        int userAge = scanner.nextInt();

        if ( userAge > 20 && userAge <=30) {
            System.out.println("20대");
        }else if ( userAge > 30 && userAge <=40){
            System.out.println("30대");
        }else if (userAge  > 40 && userAge <=50){
            System.out.println("40대");
        }else {
            System.out.println("나머지");
        }
        scanner.nextLine(); // Scanner 가 가지고 있는 "엔터" 버퍼를 비워줘야 함.

        System.out.println("이름을 입력해주세요:");
        String userName = scanner.nextLine();
        System.out.println(userName);



        System.out.println("끝");
    }
}
