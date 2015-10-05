package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron(Taco taco) {
        this.taco = taco;
    }

    public Camaron(Taco taco, String size) {
        this.taco = taco;
        this.size = size;
    }


    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        if(size.equals(Taco.MEGA)) {
            return 3.00 + taco.cost();
        }else if(size.equals(Taco.REGULAR)) {
            return 1.50 + taco.cost();
        }else {
            throw new IllegalArgumentException(Taco.MINI);
        }
    }
}
