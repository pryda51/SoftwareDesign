package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size) {
        this.size = size;

        if(size.equals(Quesadilla.MINI)) {
            description = "Quesadilla " + Quesadilla.MINI;
        }else if(size.equals(Quesadilla.MEGA)) {
            description = "Quesadilla " + Quesadilla.MEGA;
        }else if(size.equals(Quesadilla.REGULAR)) {
            description = "Quesadilla " + Quesadilla.REGULAR;
        }

        cost = 10.00;
    }


    @Override
    public double cost() {
        String size = getSize();

        if(size.equals(Taco.MINI)) {
            cost -= 2.00;
        }else if(size.equals(Taco.MEGA)) {
            cost += 2.00;
        }

        return cost;
    }
}
