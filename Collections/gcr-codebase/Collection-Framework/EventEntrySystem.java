import java.util.HashSet;

public class EventEntrySystem {
    private HashSet<String> participants = new HashSet<>();

    public void register(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("Invalid email address.");
            return;
        }

        email = email.trim().toLowerCase();

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " already registered! Duplicate rejected.");
        }
    }

    public void displayParticipants() {
        System.out.println("Registered participants: " + participants);
        System.out.println("Total attendees: " + participants.size());
    }

    public static void main(String[] args) {
        EventEntrySystem system = new EventEntrySystem();

        system.register("alice@gmail.com");
        system.register("bob@gmail.com");
        system.register("alice@gmail.com");

        system.displayParticipants();
    }
}
