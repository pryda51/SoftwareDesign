package mx.iteso.factory;

public abstract class IceCream {
    public String description = "Any icecream";


    public void prepareCone() {
        System.out.println("Preparing " + description);
        System.out.println("\tChoosing the perfect cone...");
        System.out.println("\tAdding ice cream ball...");
    }


    public String getDescription() {
        return description;
    }
}
