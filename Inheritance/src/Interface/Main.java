package Interface;

public class Main {
    public static void main(String[] args) {
        Operation o1 = new Add(); // 자식클래스로 인터페이스 타입을 가진 인스턴스 생성
        Operation o2 = new Substract();
        System.out.println(o1.calculate(1,2));
        System.out.println(o2.calculate(5,3));
    }
}
