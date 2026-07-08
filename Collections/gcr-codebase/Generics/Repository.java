import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private final List<T> entities = new ArrayList<>();

    public void add(T entity) {
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> findAll() {
        return new ArrayList<>(entities);
    }

    public int count() {
        return entities.size();
    }

    public static void main(String[] args) {
        Repository<String> stringRepo = new Repository<>();
        stringRepo.add("alpha");
        stringRepo.add("beta");
        System.out.println("Strings: " + stringRepo.findAll());
        System.out.println("String count: " + stringRepo.count());

        Repository<User> userRepo = new Repository<>();
        userRepo.add(new User("Ravi"));
        userRepo.add(new User("Priya"));
        System.out.println("Users: " + userRepo.findAll());
    }

    private static class User {
        private final String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" + "name='" + name + '\'' + '}';
        }
    }
}
