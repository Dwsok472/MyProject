class A{
    public <T> void method(T t){
        // System.out.println(t.length()); (불가능 ( String 메서드에서 호출 불가능))
        System.out.println(t.equals("안녕"));
        // 가능 (Object메서드만 호출 가능)
    }
}

public class Example2 {
    public static void main(String[] args){

        A a = new A();
        a.<String>method("안녕");
    }
}