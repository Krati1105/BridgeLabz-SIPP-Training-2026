import java.util.Scanner;
import java.util.ArrayList;
public class Subsets {
    static void generate(int[] arr, int index, ArrayList<Integer> subset) {
        if (index == arr.length) {
            System.out.println(subset);
            return;
        }
        generate(arr, index + 1, subset);
        subset.add(arr[index]);
        generate(arr, index + 1, subset);
        subset.remove(subset.size() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        generate(arr, 0, new ArrayList<>());
        sc.close();
    }
}