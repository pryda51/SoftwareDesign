package mx.iteso.observer.impl;

import mx.iteso.observer.*;

import java.util.List;

public class StoreMonitorDisplay implements Observer, Displayable {
    private List<Scorer> scorers;
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }


    public void display() {
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - " + awayTeam + " (AWAY) " + awayGoals);

        for(Scorer scorer : scorers) {
            System.out.println("Goal scored by " + scorer.getPlayerName() + " (number " + scorer.getPlayerNum() +
                                ") for the " + scorer.getPlayerTeam() + " team");
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals, List<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorers;
        display();
    }

}
