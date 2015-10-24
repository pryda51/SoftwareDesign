package mx.iteso.factory;

import mx.iteso.factory.stores.*;

public class IceCreamMain {
    public static void main(String[] args) {
        IceCream ice1 = new MilkIceCreamStore().orderIceCream("Mango");
        System.out.println("Your " + ice1.getDescription() + " is ready!! :3");
        System.out.println();

        IceCream ice2 = new WaterIceCreamStore().orderIceCream("Strawberry");
        System.out.println("Your " + ice2.getDescription() + " is ready!! :3");
        System.out.println();

        IceCream ice3 = new MilkIceCreamStore().orderIceCream("Pineapple");
        System.out.println("Your " + ice3.getDescription() + " is ready!! :3");
        System.out.println();
    }
}