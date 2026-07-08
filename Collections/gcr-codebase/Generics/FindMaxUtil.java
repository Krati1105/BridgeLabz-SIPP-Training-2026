public class FindMaxUtil {
    public static <T extends Comparable<? super T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {5, 12, 3, 17, 9};
        System.out.println("Max integer: " + findMax(integers));

        String[] strings = {"apple", "pear", "banana", "orange"};
        System.out.println("Max string: " + findMax(strings));
    }
}
