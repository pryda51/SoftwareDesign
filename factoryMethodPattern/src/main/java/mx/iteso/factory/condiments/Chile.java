package mx.iteso.factory.condiments;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleCondimentsDecorator;

public class Chile extends PozoleCondimentsDecorator {
    Pozole pozole;

    public Chile(Pozole pozole) {
        this.pozole = pozole;
    }


    @Override
    public String getDescription() {
        return pozole.getDescription() + " and chilli pepper";
    }
}
