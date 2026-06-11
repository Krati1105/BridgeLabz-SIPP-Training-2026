import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static String[][] playGames(int n, Scanner sc) {
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Rock, Paper or Scissors: ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            result[i][0] = String.valueOf(i + 1);
            result[i][1] = userChoice;
            result[i][2] = computerChoice;
            result[i][3] = winner;
        }

        return result;
    }

    public static String[][] calculateStats(String[][] games) {
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (String[] game : games) {
            if (game[3].equals("User")) {
                userWins++;
            } else if (game[3].equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        int total = games.length;

        String[][] stats = new String[3][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / total);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0) / total);

        stats[2][0] = "Draw";
        stats[2][1] = String.valueOf(draws);
        stats[2][2] = String.format("%.2f", (draws * 100.0) / total);

        return stats;
    }

    public static void display(String[][] games, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (String[] game : games) {
            System.out.println(game[0] + "\t" + game[1] + "\t" + game[2] + "\t\t" + game[3]);
        }

        System.out.println("\nPlayer\tWins\tPercentage");

        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] games = playGames(n, sc);
        String[][] stats = calculateStats(games);

        display(games, stats);

        sc.close();
    }
}