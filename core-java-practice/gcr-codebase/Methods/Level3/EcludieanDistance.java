import java.util.Scanner;

public class EuclideanDistance {
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }

    public static double[] findEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] equation = findEquation(x1, y1, x2, y2);

        System.out.println("Distance: " + distance);
        System.out.println("Slope: " + equation[0]);
        System.out.println("Y-Intercept: " + equation[1]);
        System.out.println("Equation: y = " +
                equation[0] + "x + " + equation[1]);
    }
}