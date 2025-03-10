import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("온도를 입력해주세요");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("날씨가 매우 춥습니다.얼음이 생길수 있습니다");
        } else if (0 <= temp && temp < 15) {
            System.out.println("날씨가 쌀쌀합니다. 따뜻한 옷을 입으세요");
        } else if (25 <= temp && temp < 35) {
            System.out.println("날씨가 덥습니다. 시원한 음료를 드세요");
        } else {
            System.out.println("날씨가 매우 덥습니다. 무더위에 주의하세요!");


        }
    }
}



