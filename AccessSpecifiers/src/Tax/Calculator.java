package Tax;

public class Calculator {
    void operation() {
        System.out.println("calculator is used for some operations");
    }
}
class Addition extends Calculator {
    void add() {
        int a = 10, b = 20, c = a + b;
        System.out.println("sum of two num is " + c);
    }
}
class Subtraction extends Addition {
    void sub() {
        int a = 20;
        int b = 10;
        int c = a - b;
        System.out.println("difference of two numbers is " + c);
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        addition.operation();
        addition.add();
        subtraction.operation();
        subtraction.add();
        subtraction.sub();
    }
}