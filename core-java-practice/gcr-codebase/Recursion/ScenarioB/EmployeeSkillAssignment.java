import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeSkillAssignment {
    static void findTeams(int[] skills, int index, int target, ArrayList<Integer> team) {
        if (target == 0) {
            System.out.println(team);
            return;
        }
        if (index == skills.length || target < 0)
            return;
        team.add(skills[index]);
        findTeams(skills, index + 1, target - skills[index], team);
        team.remove(team.size() - 1);
        findTeams(skills, index + 1, target, team);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] skills = new int[n];
        for (int i = 0; i < n; i++)
            skills[i] = sc.nextInt();
        int target = sc.nextInt();
        findTeams(skills, 0, target, new ArrayList<>());
        sc.close();
    }
}