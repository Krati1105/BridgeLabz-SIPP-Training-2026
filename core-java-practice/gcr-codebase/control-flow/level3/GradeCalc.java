import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();
        double percentage = (physics + chemistry + maths) / 3;
        String grade, remarks;
        if (percentage >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = "B";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Good";
        } else if (percentage >= 40) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}