import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (number >= 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result: " + result);
        } else {
            System.out.println("Enter positive integers");
        }
        sc.close();
    }
}