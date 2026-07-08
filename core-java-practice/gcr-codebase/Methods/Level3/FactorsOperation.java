import java.util.Scanner;

public class FactorsOperations {
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static double productOfCubes(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println();
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));
    }
}