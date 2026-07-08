import java.util.Scanner;

public class StudentGradeCard {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 101);
            scores[i][1] = (int) (Math.random() * 101);
            scores[i][2] = (int) (Math.random() * 101);
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percentage = result[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }

    public static void display(int[][] scores, double[][] result, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t\t" +
                scores[i][0] + "\t\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int) result[i][0] + "\t" +
                result[i][1] + "\t\t" +
                result[i][2] + "%\t\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        String[] grades = calculateGrades(result);

        display(scores, result, grades);

        sc.close();
    }
}