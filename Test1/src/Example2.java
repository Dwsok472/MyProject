public class Example2 {
    public static void main(String[] args) {
        // 정수형
        byte a = 1; // 1byte
        short b = 128; // 2byte
        int c = 1000; // 4byte
        long d = 100000L; // 8byte
        // 시수형
        float e = 3.5F; // 4byte
        double f = 3.14159209124; // 8byte
        // 문자형
        char g = 'A'; // 2byte
        String h = "안녕하세요"; // 가변(값마다 다름)
        // 불리언형 ( 참거짓 )
        boolean i = false; // 1byte
        System.out.println(c);

        // 숫자 진법에 따른 다양한 표기법
        c = 15; // 10진법 표기
        System.out.println(c);
        c= 0b1111; // 2진법 표기
        System.out.println(c);
        c = 0xF; // 16진법 표기
        System.out.println(c);
    }
}
