package Observer;

public class ObserverMain {
    public static void main(String[] args) {
        MainScoreDisplay mainScoreDisplay = new MainScoreDisplay();
        StatisticDisplay statisticDisplay1 = new StatisticDisplay();
        StatisticDisplay statisticDisplay2 = new StatisticDisplay();

        FootballData footballData = new FootballData(0,"Chelsea", "Newcastle");
        footballData.addUpdatable(mainScoreDisplay);
        footballData.addUpdatable(statisticDisplay1);
        footballData.addUpdatable(statisticDisplay2);
        footballData.startGame();

        footballData.addScorer(new Goal("Chelsea", "Kante", 3, "Reece James"));
        footballData.addScorer(new Goal("Chelsea", "Jorginio", 10, "Kante"));
    }
}
