package br.com.digital.innovation.one.aula2;

public class HighOrderFunction {
    public static void main(String[] args) {
        Calculation SUM = (a, b) -> a + b;
        Calculation SUBTRACTION = (a, b) -> a - b;
        Calculation DIVISION = (a, b) -> a / b;
        Calculation MULTIPLICATION = (a, b) -> a * b;
        System.out.println(executeOperation(SUM, 1, 3));
        System.out.println(executeOperation(SUBTRACTION, 10, 5));
        System.out.println(executeOperation(DIVISION, 21, 3));
        System.out.println(executeOperation(MULTIPLICATION, 6, 5));
    }

    public static int executeOperation(Calculation calculation, int a, int b) {
        return calculation.calculate(a, b);
    }
}

@FunctionalInterface
interface Calculation {
    public int calculate(int a, int b);
}