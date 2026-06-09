import java.util.Scanner;
public class MultiplesBelowHundredFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            System.out.println("Multiples below 100:");
            for (int i = number; i < 100; i += number) {
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}