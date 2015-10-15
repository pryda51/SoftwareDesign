package mx.iteso.factory;

public abstract class Pozole {
    public String description = "Any pozole";
    public String broth;


    public void serve() {
        System.out.println("\tServing in regular pozole plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + description);
        System.out.println("\tAdding corn kernels..." );
        System.out.println("\tAdding broth..." );

    }

    public String getDescription(){
        return description;
    }
}