package mx.iteso.factory;

public abstract class IceCreamStore {
    public IceCream orderIceCream(String flavor) {
        IceCream iceCream;

        iceCream = createIceCream(flavor);

        iceCream.prepareCone();

        return iceCream;
    }


    protected abstract IceCream createIceCream(String flavor);
}
