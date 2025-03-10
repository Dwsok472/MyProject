package Modifier_1.pack1;

public class A {
    public int a = 1; // 모든 패키지가 다 읽을수 있음
    protected  int b = 2; // 같은 패키지만 가능
    int c = 3; // 같은 패키지만 가능
    private int d  = 4; // A클래스가 아니면 다 막혀있음
    // 외부패키지에서 읽을 수 없는  b,c,d는 public 메서드를 통해서만 엑세스 가능
    public void print() {
        System.out.print(a + "");
        System.out.print(b + "");
        System.out.print(c + "");
        System.out.print(d + "");
        System.out.println();
    }
}
