import java.util.Arrays;
import java.util.Comparator;

public class EmployeeAttendanceRanking {
    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {
        int n = employeeIds.length;
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        Arrays.sort(employees, Comparator
                .comparingInt(Employee::getAttendance).reversed()
                .thenComparingInt(Employee::getId));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = employees[i].getId();
        }
        return result;
    }

    private static class Employee {
        private final int id;
        private final int attendance;

        public Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }

        public int getId() {
            return id;
        }

        public int getAttendance() {
            return attendance;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;

        int[] topEmployees = topKEmployees(employeeIds, attendance, k);
        System.out.println("Top " + k + " employees: " + Arrays.toString(topEmployees));
    }
}
