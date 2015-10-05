package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Volcan extends Taco {
    public Volcan() {
        description = "Volcan";

        cost = 12.00;
    }


    @Override
    public double cost() {
        return cost;
    }
}
