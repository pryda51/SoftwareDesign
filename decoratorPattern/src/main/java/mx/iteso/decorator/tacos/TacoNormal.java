package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.size = size;

        if(size.equals(Taco.MINI)) {
            description = "Taco normal " + Taco.MINI;
        }else if(size.equals(Taco.MEGA)) {
            description = "Taco normal " + Taco.MEGA;
        }else if(size.equals(Taco.REGULAR)) {
            description = "Taco normal " + Taco.REGULAR;
        }

        cost = 8.00;
    }


    @Override
    public double cost() {
        String size = getSize();

        if(size.equals(Taco.MINI)) {
            cost -= 1.00;
        }else if(size.equals(Taco.MEGA)) {
            cost += 1.00;
        }

        return cost;
    }
}
