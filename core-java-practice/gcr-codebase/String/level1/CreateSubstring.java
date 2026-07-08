import java.util.Scanner;

public class Program2 {
    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean result = compareStrings(userSubstring, builtInSubstring);

        System.out.println("User-defined: " + userSubstring);
        System.out.println("Built-in: " + builtInSubstring);
        System.out.println("Same Result: " + result);

        sc.close();
    }
}