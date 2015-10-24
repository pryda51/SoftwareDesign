package mx.iteso.factory.stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.icecream.*;

public class WaterIceCreamStore extends IceCreamStore {
    @Override
    protected IceCream createIceCream(String flavor) {
        if(flavor.equals("Strawberry"))
            return new StrawberryWaterIceCream();
        else if(flavor.equals("Pineapple"))
            return new PineappleWaterIceCream();
        else if(flavor.equals("Mango"))
            return new MangoWaterIceCream();
        else if(flavor.equals("Guava"))
            return new GuavaWaterIceCream();
        else return null;
    }
}
