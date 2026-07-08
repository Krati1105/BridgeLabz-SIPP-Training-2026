import java.util.Scanner;
public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int multiple = number;
            System.out.println("Multiples below 100:");
            while (multiple < 100) {
                System.out.println(multiple);
                multiple += number;
            }
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}