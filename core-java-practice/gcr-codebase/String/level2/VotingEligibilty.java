import java.util.Scanner;

public class VotingEligibility {
    public static int[] getAges(int n) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90);
        }

        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("Age\tCan Vote");

        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;

        int[] ages = getAges(n);
        String[][] result = checkEligibility(ages);

        display(result);

        sc.close();
    }
}