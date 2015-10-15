package mx.iteso.factory;

import mx.iteso.factory.condiments.*;
import mx.iteso.factory.stores.AllPozolesStore;

public class PozoleMain {
    public static void main (String[] args) {
        AllPozolesStore store = new AllPozolesStore();


        Pozole pozole1 = store.createPozole("rojo", "pollo");
        pozole1 = new Col(pozole1);
        pozole1 = new Lechuga(pozole1);

        System.out.println("First order is: " + pozole1.getDescription());
        System.out.println();


        Pozole pozole2 = store.createPozole("blanco", "trompa");
        pozole2 = new Chile(pozole2);
        pozole2 = new Col(pozole2);
        pozole2 = new Rabanos(pozole2);

        System.out.println("Second order is: " + pozole2.getDescription());
        System.out.println();
    }
}