import java.util.Scanner;

public class BMIProgram {
    public static void calculateBMI(double[][] people) {
        for (int i = 0; i < people.length; i++) {
            double heightInMeters = people[i][1] / 100;
            people[i][2] = people[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] people) {
        String[] status = new String[people.length];

        for (int i = 0; i < people.length; i++) {
            double bmi = people[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] people = new double[10][3];

        for (int i = 0; i < 10; i++) {
            people[i][0] = sc.nextDouble();
            people[i][1] = sc.nextDouble();
        }

        calculateBMI(people);
        String[] status = getBMIStatus(people);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Weight: %.2f Height: %.2f BMI: %.2f Status: %s%n",
                    people[i][0], people[i][1], people[i][2], status[i]);
        }
    }
}