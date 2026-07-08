import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceTracker {
    private HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendance.get(subject);
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " already marked in " + subject);
        }
    }

    public void displayAttendance() {
        for (String subject : attendance.keySet()) {
            ArrayList<String> students = attendance.get(subject);
            System.out.println("Subject: " + subject);
            System.out.println("Students: " + students);
            System.out.println("Total present: " + students.size());
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker();

        tracker.markAttendance("Math", "Ravi");
        tracker.markAttendance("Math", "Priya");
        tracker.markAttendance("Science", "Ravi");
        tracker.markAttendance("Math", "Ravi");

        tracker.displayAttendance();
    }
}
