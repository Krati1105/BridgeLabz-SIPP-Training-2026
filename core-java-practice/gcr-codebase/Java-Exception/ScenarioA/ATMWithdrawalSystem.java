import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {
        super("Insufficient balance. Available: ₹" + balance +
                ", Requested: ₹" + requestedAmount);
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}

public class ATMWithdrawalSystem {
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        System.out.println("Withdrawal successful. Remaining balance: ₹"
                + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;
        double amount = sc.nextDouble();

        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}