package Observer;

public class Goal {
    String team;
    String playerName;
    int time;
    String assistPlayerName;

    public Goal(String team, String playerName, int time, String assistPlayerName) {
        this.team = team;
        this.playerName = playerName;
        this.time = time;
        this.assistPlayerName = assistPlayerName;
    }

    public String getTeam() {
        return team;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getTime() {
        return time;
    }

    public String getAssistPlayerName() {
        return assistPlayerName;
    }
}
