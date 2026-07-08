public class EmployeeBonus {
    public static double[][] generateEmployeeData() {
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 11) + 1;
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }

        return result;
    }

    public static void displayReport(double[][] oldData, double[][] newData) {
        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;

        System.out.printf("%-10s%-10s%-15s%-15s%-10s%n",
                "Emp", "Years", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < 10; i++) {
            oldSalaryTotal += oldData[i][0];
            newSalaryTotal += newData[i][0];
            bonusTotal += newData[i][1];

            System.out.printf("%-10d%-10.0f%-15.2f%-15.2f%-10.2f%n",
                    i + 1,
                    oldData[i][1],
                    oldData[i][0],
                    newData[i][0],
                    newData[i][1]);
        }

        System.out.println("Total Old Salary: " + oldSalaryTotal);
        System.out.println("Total New Salary: " + newSalaryTotal);
        System.out.println("Total Bonus: " + bonusTotal);
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonus(employeeData);

        displayReport(employeeData, updatedData);
    }
}