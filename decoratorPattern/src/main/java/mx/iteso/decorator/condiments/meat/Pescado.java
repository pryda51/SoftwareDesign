package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado(Taco taco) {
        this.taco = taco;
    }

    public Pescado(Taco taco, String size) {
        this.taco = taco;
        this.size = size;
    }


    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        if(size.equals(Taco.MEGA)) {
            return 2.00 + taco.cost();
        }else if(size.equals(Taco.REGULAR)) {
            return 1.00 + taco.cost();
        }else {
            throw new IllegalArgumentException(Taco.MINI);
        }
    }
}
