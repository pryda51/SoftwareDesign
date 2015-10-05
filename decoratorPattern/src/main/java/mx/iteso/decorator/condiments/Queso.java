package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco) {
        this.taco = taco;
    }

    public Queso(Taco taco, String size){
        this.taco = taco;
        this.size = size;
    }


    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        if(size.equals(Taco.MINI)) {
            return 1.00 + taco.cost();
        }else if(size.equals(Taco.MEGA)) {
            return 3.50 + taco.cost();
        }else {
            return 2.00 + taco.cost();
        }
    }
}
