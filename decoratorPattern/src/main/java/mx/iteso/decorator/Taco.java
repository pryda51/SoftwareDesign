package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Cualquier taco";
    public double cost;

    public String size = REGULAR;

    public final static String MINI = "tamaño mini";
    public final static String REGULAR = "tamaño regular";
    public final static String MEGA = "tamaño mega";

    public String getDescription(){
        return description;
    }

    public String getSize() {
        return size;
    }

    public abstract double cost();
}
