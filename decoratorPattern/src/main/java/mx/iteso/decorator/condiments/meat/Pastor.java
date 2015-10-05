package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor(Taco taco){
        this.taco = taco;
    }

    public Pastor(Taco taco, String size) {
        this.taco = taco;
        this.size = size;
    }


    @Override
    public String getDescription() {
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        if(size.equals(Taco.MINI)) {
            return -0.50 + taco.cost();
        }else if(size.equals(Taco.MEGA)) {
            return 0.50 + taco.cost();
        }else {
            return 0.00 + taco.cost();
        }
    }
}
