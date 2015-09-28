package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;
import java.util.List;

public class NewsStation {
    public static void main(String[] args) {
        ScoresData scoresData;
        scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        //MobileAppDisplay mobileAppDisplay = new MobileAppDisplay(scoresData);

        List<Scorer> scorersTI = new ArrayList<Scorer>();
        List<Scorer> scorersCA = new ArrayList<Scorer>();
        List<Scorer> scorersLGMA = new ArrayList<Scorer>();


        //Resultados de partidos
        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, scorersTI);
        scoresData.setScore("Chivas", "América", 2, 1, scorersCA);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0, scorersLGMA);

        //Lista de goleadores
        scorersTI.add(new Scorer("Raymundo", 5, "Forward", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Ubaldo", 22, "Forward", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Sex Dan", 13, "Midfielder", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Ubaldo", 22, "Forward", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Ubaldo", 22, "Forward", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Villa", 7, "Midfielder", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Sex Dan", 13, "Midfielder", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Ubaldo", 22, "Forward", "Tacit Knowledge"));
        scorersTI.add(new Scorer("Tello", 8, "Forward", "Intel"));

        scorersCA.add(new Scorer("Omar Bravo", 9, "Forward", "Chivas"));
        scorersCA.add(new Scorer("Omar Bravo", 9, "Forward", "Chivas"));
        scorersCA.add(new Scorer("Osvaldo Martínez", 3, "Forward", "América"));
    }
}
