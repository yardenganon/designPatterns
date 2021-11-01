package Observer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FootballData {
    boolean isOn = false;
    private int minutesPlayed;
    ArrayList<Goal> goalsList;
    String homeTeam;
    String awayTeam;
    ArrayList<Updatable> updatables;

    public FootballData(int minutesPlayed, String homeTeam, String awayTeam) {
        this.minutesPlayed = minutesPlayed;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goalsList = new ArrayList<>();
        this.updatables = new ArrayList<>();
    }

    public void addUpdatable(Updatable updatable) {
        this.updatables.add(updatable);
        updatable.update(minutesPlayed, goalsList, homeTeam, awayTeam);
    }

    public void startGame() {
        this.isOn = true;
        System.out.println("Game is started...");
        Runnable task = () -> {
            while (isOn){
                try {
                    TimeUnit.MINUTES.sleep(1);
                    this.minutesPlayed++;
                    updatables.forEach(updatable -> updatable.update(minutesPlayed, goalsList, homeTeam, awayTeam));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    public void endGame() {
        this.isOn = false;
        System.out.println("Game is ended...");
    }

    public void addScorer(Goal goal) {
        System.out.println("GOAL!!!");
        this.minutesPlayed = goal.getTime();
        this.goalsList.add(goal);
        updatables.forEach(updatable -> updatable.update(minutesPlayed, goalsList, homeTeam, awayTeam));
    }

}

