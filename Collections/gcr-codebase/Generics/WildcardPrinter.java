import java.util.List;

public class WildcardPrinter {
    public static void printList(List<?> list) {
        System.out.println("Printing list contents:");
        for (Object item : list) {
            System.out.println(" - " + item);
        }
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Red", "Green", "Blue");
        printList(strings);

        List<Integer> ints = List.of(1, 2, 3);
        printList(ints);
    }
}
