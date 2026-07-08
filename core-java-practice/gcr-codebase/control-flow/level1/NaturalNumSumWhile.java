import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number > 0) {
            int formulaSum = number * (number + 1) / 2;
            int whileSum = 0;
            int i = 1;
            while (i <= number) {
                whileSum += i;
                i++;
            }
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using while loop = " + whileSum);
            if (formulaSum == whileSum) {
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