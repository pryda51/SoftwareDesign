package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.*;

public class JamaiconSportsLifesaversMain {
    public static void main(String[] args) {
        Lifesaver armBands = new ArmBands();
        Lifesaver foamFloats = new FoamFloats();
        Lifesaver candies = new LifesaversCandies();
        Lifesaver lifeVests = new LifeVests();
        Lifesaver swimBelts = new SwimBelts();
        Lifesaver swimRing = new SwimRing();
        Lifesaver swimSeat = new SwimSeat();
        Lifesaver waterTubes = new WaterTubes();


        System.out.println(armBands.display());
        System.out.println(armBands.performInflating());
        System.out.println(armBands.performDeflating());
        System.out.println(armBands.floating());

        System.out.println();

        System.out.println(foamFloats.display());
        System.out.println(foamFloats.performInflating());
        System.out.println(foamFloats.performDeflating());
        System.out.println(foamFloats.floating());

        System.out.println();

        System.out.println(candies.display());
        System.out.println(candies.performInflating());
        System.out.println(candies.performDeflating());
        System.out.println(candies.floating());

        System.out.println();

        System.out.println(lifeVests.display());
        System.out.println(lifeVests.performInflating());
        System.out.println(lifeVests.performDeflating());
        System.out.println(lifeVests.floating());

        System.out.println();

        System.out.println(lifeVests.display());
        System.out.println(lifeVests.performInflating());
        System.out.println(lifeVests.performDeflating());
        System.out.println(lifeVests.floating());

        System.out.println();

        System.out.println(swimRing.display());
        System.out.println(swimRing.performInflating());
        System.out.println(swimRing.performDeflating());
        System.out.println(swimRing.floating());

        System.out.println();

        System.out.println(swimSeat.display());
        System.out.println(swimSeat.performInflating());
        System.out.println(swimSeat.performDeflating());
        System.out.println(swimSeat.floating());

        System.out.println();

        System.out.println(waterTubes.display());
        System.out.println(waterTubes.performInflating());
        System.out.println(waterTubes.performDeflating());
        System.out.println(waterTubes.floating());
    }
}
