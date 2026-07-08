import java.util.ArrayList;
import java.util.List;

public class SmartWarehouseSystem {
    public static abstract class WarehouseItem {
        private final String id;
        private final String name;

        protected WarehouseItem(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
        }
    }

    public static class Electronics extends WarehouseItem {
        public Electronics(String id, String name) {
            super(id, name);
        }
    }

    public static class Groceries extends WarehouseItem {
        public Groceries(String id, String name) {
            super(id, name);
        }
    }

    public static class Furniture extends WarehouseItem {
        public Furniture(String id, String name) {
            super(id, name);
        }
    }

    public static class Storage<T extends WarehouseItem> {
        private final List<T> items = new ArrayList<>();

        public void add(T item) {
            items.add(item);
        }

        public T get(int index) {
            return items.get(index);
        }

        public List<T> getItems() {
            return new ArrayList<>(items);
        }
    }

    public static void displayAllItems(List<? extends WarehouseItem> items) {
        System.out.println("Warehouse contains:");
        for (WarehouseItem item : items) {
            System.out.println(" - " + item);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.add(new Electronics("E-101", "Smartphone"));
        electronicsStorage.add(new Electronics("E-102", "Laptop"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.add(new Groceries("G-201", "Rice"));
        groceryStorage.add(new Groceries("G-202", "Olive Oil"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.add(new Furniture("F-301", "Office Chair"));
        furnitureStorage.add(new Furniture("F-302", "Dining Table"));

        displayAllItems(electronicsStorage.getItems());
        displayAllItems(groceryStorage.getItems());
        displayAllItems(furnitureStorage.getItems());
    }
}
