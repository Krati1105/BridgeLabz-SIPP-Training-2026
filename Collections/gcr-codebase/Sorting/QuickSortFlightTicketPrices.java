import java.util.Scanner;

public class QuickSortFlightTicketPrices {
    public static void quickSort(int[] arr) {
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    private static void quickSortRecursive(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = arr[high];
        int partitionIndex = lomutoPartition(arr, low, high, pivot);
        quickSortRecursive(arr, low, partitionIndex - 1);
        quickSortRecursive(arr, partitionIndex + 1, high);
    }

    private static int lomutoPartition(int[] arr, int low, int high, int pivot) {
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        scanner.close();

        quickSort(prices);
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
