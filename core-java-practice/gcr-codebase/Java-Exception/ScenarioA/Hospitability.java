import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    static void processPayment(double availableAmount, double billAmount)
            throws InsufficientFundsException {
        if (availableAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int totalBill = Integer.parseInt(sc.nextLine());
            int items = Integer.parseInt(sc.nextLine());

            int[] patients = {101, 102, 103, 104, 105};
            int patientIndex = Integer.parseInt(sc.nextLine());

            double availableAmount = Double.parseDouble(sc.nextLine());

            double amountPerItem = totalBill / items;
            System.out.println("Amount per item: " + amountPerItem);

            System.out.println("Patient ID: " + patients[patientIndex]);

            processPayment(availableAmount, totalBill);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}