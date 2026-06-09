import java.util.Scanner;
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        if (number > 1) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor: " + greatestFactor);
        } else {
            System.out.println("Number should be greater than 1");
        }
        sc.close();
    }
}