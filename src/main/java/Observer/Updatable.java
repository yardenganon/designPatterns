package Observer;

import java.util.ArrayList;

public interface Updatable {
    public void update(int minutesPlayed, ArrayList<Goal> goalsList, String homeTeam, String awayTeam);
}
