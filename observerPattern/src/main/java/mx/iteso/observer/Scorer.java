package mx.iteso.observer;

public class Scorer {
    private String PlayerName;
    private int PlayerNum;
    private String PlayerPosition;
    private String PlayerTeam;


    public Scorer() {

    }

    public Scorer(String name, int num, String position, String team) {
        this.PlayerName = name;
        this.PlayerNum = num;
        this.PlayerPosition = position;
        this.PlayerTeam = team;
    }


    public String getPlayerName() {
        return PlayerName;
    }

    public int getPlayerNum() {
        return PlayerNum;
    }

    public String getPlayerPosition() {
        return PlayerPosition;
    }

    public String getPlayerTeam() {
        return PlayerTeam;
    }
}
