import java.util.Scanner;

public class BowlingTeamDemo2 {
    public static void main(String[] args) {
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int i, j;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        for (j = 0; j < NUM_TEAMS; j++) {
            teams[j] = new BowlingTeam();
            System.out.print("Enter team name: ");
            name = input.nextLine();
            teams[j].setTeamName(name);
            for (i = 0; i < NUM_TEAM_MEMBERS; i++) {
                System.out.print("Enter team member's name: ");
                name = input.nextLine();
                teams[j].setMembers(i, name);
            }
        }

        for (j = 0; j < NUM_TEAMS; j++) {
            System.out.println("\nMembers of team " +
                    teams[j].getTeamName());
            for (i = 0; i < NUM_TEAM_MEMBERS; i++) {
                System.out.print(teams[j].getMembers(i) + " ");
            }
            System.out.println();
        }
    }
}
