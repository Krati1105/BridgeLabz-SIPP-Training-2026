import java.util.Scanner;
public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                i--;
                continue;
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5)
                status[i] = "Underweight";
            else if (personData[i][2] < 25)
                status[i] = "Normal";
            else if (personData[i][2] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][1] + " " + personData[i][0] + " " + personData[i][2] + " " + status[i]);
        }
        sc.close();
    }
}