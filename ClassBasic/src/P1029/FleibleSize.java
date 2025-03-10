package P1029;

public class FleibleSize {
    public static void main(String[] args) {
        // #1. method1(int... value)
        method1(1,2);
        method1(1,2,3);
        method1();

        // #2. method2(String... values
        method2("안녕", "방가");
        method2("땡큐", "베리", "감사");
        method2();
;
    }

    public static void method1(int... values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " ");
        }

    }

    public static void method2(String... values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");

        }
        System.out.println( );
    }

}
