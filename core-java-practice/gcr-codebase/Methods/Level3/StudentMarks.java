import java.util.Scanner;

public class StudentMarks {
    public static int findTotal(int physics, int chemistry, int maths) {
        return physics + chemistry + maths;
    }

    public static double findAverage(int total) {
        return total / 3.0;
    }

    public static double findPercentage(int total) {
        return (total / 300.0) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();

        int total = findTotal(physics, chemistry, maths);
        double average = findAverage(total);
        double percentage = findPercentage(total);

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}