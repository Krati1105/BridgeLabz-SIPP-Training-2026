import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is Positive and ");

                if (isEven(number)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(number + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}