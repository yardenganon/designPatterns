package Observer;

import java.util.ArrayList;

public class MainScoreDisplay implements Displayable, Updatable {
    private int minutesPlayed;
    ArrayList<Goal> goalsList;
    String homeTeam;
    String awayTeam;

    @Override
    public void update(int minutesPlayed, ArrayList<Goal> goalsList, String homeTeam, String awayTeam) {
        this.minutesPlayed = minutesPlayed;
        this.goalsList = goalsList;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        display();
    }

    @Override
    public void display() {
        int homeTeamScore = (int) goalsList.stream().filter(goal -> goal.getTeam().equals(homeTeam)).count();
        int awayTeamScore = goalsList.size() - homeTeamScore;
        System.out.println("Score: " + homeTeam + " " + homeTeamScore + " - " + awayTeamScore + " " + awayTeam);
        goalsList.forEach(goal -> System.out.println(goal.getTime() + "' " + goal.getTeam() + " - " + goal.getPlayerName() + " (" + goal.getAssistPlayerName() + ")"));
    }
}
