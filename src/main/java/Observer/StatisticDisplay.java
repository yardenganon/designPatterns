package Observer;

import java.util.ArrayList;

public class StatisticDisplay implements Displayable, Updatable {
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
        System.out.println("Teams: " + homeTeam + " - " + awayTeam);
        System.out.println("Number of goals: " + goalsList.size());
        System.out.println("Time Played: " + minutesPlayed);
    }
}
