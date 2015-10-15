package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleCondimentsDecorator;

public class Col extends PozoleCondimentsDecorator {
    Pozole pozole;

    public Col(Pozole pozole) {
        this.pozole = pozole;
    }


    @Override
    public String getDescription() {
        return pozole.getDescription() + " and cabbage";
    }
}
