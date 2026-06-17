import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int size = sc.nextInt();

            Integer[] arr = null;

            if (size > 0) {
                arr = new Integer[size];

                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }
            }

            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}