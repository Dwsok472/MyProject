package Abstract;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.displayResult(2,4);// Result : 6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4);// Result : 8.0
    }
}
