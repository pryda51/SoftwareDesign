package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;

public class AllPozolesStore {
    public Pozole createPozole(String type, String meat) {
        Pozole pozole = null;

        if(type.equals("rojo")) {
            PozoleRojoStore rojoStore = new PozoleRojoStore();
            pozole = rojoStore.orderPozole(meat);
        } else if(type.equals("verde")) {
            PozoleVerdeStore verdeStore = new PozoleVerdeStore();
            pozole = verdeStore.orderPozole(meat);
        } else if(type.equals("blanco")) {
            PozoleBlancoStore blancoStore = new PozoleBlancoStore();
            pozole = blancoStore.orderPozole(meat);
        } else if(type.equals("menudo")) {
            MenudoStore menudoStore = new MenudoStore();
            pozole = menudoStore.orderPozole(meat);
        } else if(type.equals("pozolillo")) {
            PozolilloStore pozolilloStore = new PozolilloStore();
            pozole = pozolilloStore.orderPozole(meat);
        }

        return pozole;
    }
}
