import java.util.Scanner;
public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        for (int i = 0; i < number; i++) {
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }
        sc.close();
    }
}