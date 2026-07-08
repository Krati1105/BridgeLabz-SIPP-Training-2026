import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= number; i++) {
                forSum += i;
            }
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + forSum);
            if (formulaSum == forSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Results do not match.");
            }
        } else {
            System.out.println(number + " is not a natural number.");
        }
        sc.close();
    }
}