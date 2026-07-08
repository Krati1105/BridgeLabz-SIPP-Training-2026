import java.util.Scanner;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }

        sc.close();
    }
}