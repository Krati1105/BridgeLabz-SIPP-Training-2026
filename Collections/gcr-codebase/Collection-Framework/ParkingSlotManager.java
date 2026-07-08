import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingSlotManager {
    private final int capacity;
    private final List<String> parkedVehicles;

    public ParkingSlotManager(int capacity) {
        this.capacity = capacity;
        this.parkedVehicles = new ArrayList<>(capacity);
    }

    public void addVehicle(String regNo) {
        if (regNo == null || regNo.trim().isEmpty()) {
            System.out.println("Invalid registration number.");
            return;
        }

        regNo = regNo.trim().toUpperCase();

        if (parkedVehicles.contains(regNo)) {
            System.out.println(regNo + " is already parked.");
            return;
        }

        if (parkedVehicles.size() >= capacity) {
            System.out.println("Parking is full. Cannot add " + regNo + ".");
            return;
        }

        parkedVehicles.add(regNo);
        System.out.println(regNo + " entered the parking area.");
    }

    public void removeVehicle(String regNo) {
        if (regNo == null || regNo.trim().isEmpty()) {
            System.out.println("Invalid registration number.");
            return;
        }

        regNo = regNo.trim().toUpperCase();

        if (parkedVehicles.remove(regNo)) {
            System.out.println(regNo + " exited the parking area.");
        } else {
            System.out.println(regNo + " not found in parking.");
        }
    }

    public void searchVehicle(String regNo) {
        if (regNo == null || regNo.trim().isEmpty()) {
            System.out.println("Invalid registration number.");
            return;
        }

        regNo = regNo.trim().toUpperCase();

        if (parkedVehicles.contains(regNo)) {
            System.out.println(regNo + " is currently parked.");
        } else {
            System.out.println(regNo + " is not parked.");
        }
    }

    public void displayVehicles() {
        if (parkedVehicles.isEmpty()) {
            System.out.println("No vehicles are currently parked.");
        } else {
            System.out.println("Vehicles parked: " + parkedVehicles);
        }
        System.out.println("Total slots occupied: " + parkedVehicles.size() + " / " + capacity);
    }

    private void displayMenu() {
        System.out.println("\nParking Slot Manager");
        System.out.println("1. Add vehicle");
        System.out.println("2. Remove vehicle");
        System.out.println("3. Search vehicle");
        System.out.println("4. Display parked vehicles");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            String option = scanner.nextLine().trim();

            switch (option) {
                case "1" -> {
                    System.out.print("Enter registration number to add: ");
                    addVehicle(scanner.nextLine());
                }
                case "2" -> {
                    System.out.print("Enter registration number to remove: ");
                    removeVehicle(scanner.nextLine());
                }
                case "3" -> {
                    System.out.print("Enter registration number to search: ");
                    searchVehicle(scanner.nextLine());
                }
                case "4" -> displayVehicles();
                case "5" -> {
                    running = false;
                    System.out.println("Exiting Parking Slot Manager.");
                }
                default -> System.out.println("Invalid option. Please choose 1-5.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ParkingSlotManager manager = new ParkingSlotManager(10);

        manager.addVehicle("UP85AB1234");
        manager.addVehicle("DL10XY5678");
        manager.displayVehicles();

        System.out.println("\nStarting interactive menu...");
        manager.run();
    }
}
