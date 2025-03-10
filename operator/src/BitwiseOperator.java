public class BitwiseOperator {
    public static void main(String[] args) {
        // 비트 연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); //1101
        System.out.println(Integer.toOctalString(data));  // 15
        System.out.println(Integer.toHexString(data)); // d

        System.out.println(Integer.parseInt("1101",2));
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.parseInt("0d",16));
        System.out.println();

        System.out.println(13); // 13
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0xd);
        System.out.println();

        // &(앤드) 비트연산자 하나라도 거짓이면 거짓
        System.out.println(3 & 10);
        System.out.println(12 & 9);
        // |(올) 비트연산자 하나라도 트루면 트루
        System.out.println(3 | 10);
        // ^(낫) 비트연산자
        System.out.println(3 ^ 10);
        // ! 비트연산자
        System.out.println(~3);


    }
}
