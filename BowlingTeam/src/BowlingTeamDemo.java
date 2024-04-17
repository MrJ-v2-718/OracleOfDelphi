import java.util.Scanner;

public class BowlingTeamDemo {
    public static void main(String[] args) {
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int i;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter team name: ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        for (i = 0; i < NUM_TEAM_MEMBERS; i++) {
            System.out.print("Enter team member's name: ");
            name = input.nextLine();
            bowlTeam.setMembers(i, name);
        }

        System.out.println("\nMembers of team " +
                bowlTeam.getTeamName());

        for (i = 0; i < NUM_TEAM_MEMBERS; i++) {
            System.out.print(bowlTeam.getMembers(i) + " ");
        }
        System.out.println();
    }
}
