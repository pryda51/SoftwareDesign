package mx.iteso.singleton.boilers;

import mx.iteso.singleton.ChocolateFactory;

public class Boiler1 extends ChocolateFactory {
    private static volatile ChocolateFactory boiler1 = null;


    private Boiler1() {
        this.empty = true;
        this.boiled = false;
    }


    public ChocolateFactory getInstance() {
        if(boiler1 == null) {
            synchronized(this) {
                if(boiler1 == null) {
                    boiler1 = new Boiler1();
                }
            }
        }

        return boiler1;
    }

    public static synchronized ChocolateFactory getBoiler1Instance() {
        if(boiler1 == null) {
            boiler1 = new Boiler1();
        }

        return boiler1;
    }

    public static void clearInstance() {
        boiler1 = null;
    }
}
