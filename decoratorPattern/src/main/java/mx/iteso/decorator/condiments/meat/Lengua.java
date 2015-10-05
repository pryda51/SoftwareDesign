package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua extends CondimentsDecorator {
    Taco taco;

    public Lengua(Taco taco){
        this.taco = taco;
    }

    public Lengua(Taco taco, String size) {
        this.taco = taco;
        this.size = size;
    }


    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        if(size.equals(Taco.MINI)) {
            return 1.00 + taco.cost();
        }else if(size.equals(Taco.MEGA)) {
            return 3.00 + taco.cost();
        }else {
            return 2.00 + taco.cost();
        }
    }
}
