public class OnlineMarketplace {
    public interface Category {
        String getCategoryName();
    }

    public static class BookCategory implements Category {
        @Override
        public String getCategoryName() {
            return "Books";
        }
    }

    public static class ClothingCategory implements Category {
        @Override
        public String getCategoryName() {
            return "Clothing";
        }
    }

    public static class GadgetCategory implements Category {
        @Override
        public String getCategoryName() {
            return "Gadgets";
        }
    }

    public static class Product<T extends Category> {
        private final String name;
        private double price;
        private final T category;

        public Product(String name, double price, T category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public T getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return "Product{" + "name='" + name + '\'' + ", price=" + price + ", category='" + category.getCategoryName() + '\'' + '}';
        }
    }

    public static <T extends Product<? extends Category>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * percentage / 100.0;
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Applied " + percentage + "% discount to " + product.getName() + ". New price: " + product.getPrice());
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Fundamentals", 499.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Denim Shirt", 1299.0, new ClothingCategory());
        Product<GadgetCategory> earphones = new Product<>("Wireless Earphones", 2499.0, new GadgetCategory());

        System.out.println(book);
        System.out.println(shirt);
        System.out.println(earphones);

        applyDiscount(book, 10);
        applyDiscount(shirt, 20);
        applyDiscount(earphones, 15);
    }
}
