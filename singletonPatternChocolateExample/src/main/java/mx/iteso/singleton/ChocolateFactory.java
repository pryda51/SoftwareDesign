package mx.iteso.singleton;

public abstract class ChocolateFactory {
    public boolean empty;
    public boolean boiled;


    public void fill() {
        if(isEmpty()) {
            //Fill the boiler with a milk/chocolate mixture
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            //Drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            //Bring the contents to a boil
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}