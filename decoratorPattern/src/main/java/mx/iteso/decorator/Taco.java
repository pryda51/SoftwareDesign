package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Cualquier taco";
    public double cost;

    public String size = REGULAR;

    public final static String MINI = "tama�o mini";
    public final static String REGULAR = "tama�o regular";
    public final static String MEGA = "tama�o mega";

    public String getDescription(){
        return description;
    }

    public String getSize() {
        return size;
    }

    public abstract double cost();
}
