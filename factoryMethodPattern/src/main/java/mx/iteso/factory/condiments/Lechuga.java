package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleCondimentsDecorator;

public class Lechuga extends PozoleCondimentsDecorator {
    Pozole pozole;

    public Lechuga(Pozole pozole) {
        this.pozole = pozole;
    }


    @Override
    public String getDescription() {
        return pozole.getDescription() + " and lettuce";
    }
}
