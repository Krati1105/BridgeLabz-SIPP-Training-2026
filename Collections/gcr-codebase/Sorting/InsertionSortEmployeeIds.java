import java.util.Arrays;

public class InsertionSortEmployeeIds {
    public static void insertionSort(int[] employeeIds) {
        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }
            employeeIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {105, 101, 109, 102, 108, 103};
        System.out.println("Original IDs: " + Arrays.toString(employeeIds));
        insertionSort(employeeIds);
        System.out.println("Sorted IDs: " + Arrays.toString(employeeIds));
    }
}
