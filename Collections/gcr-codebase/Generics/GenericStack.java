import java.util.ArrayList;

public class GenericStack<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("first");
        stringStack.push("second");
        System.out.println("Top of string stack: " + stringStack.peek());
        System.out.println("Popped: " + stringStack.pop());

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Top of int stack: " + intStack.peek());
        System.out.println("Stack size: " + intStack.size());
    }
}
