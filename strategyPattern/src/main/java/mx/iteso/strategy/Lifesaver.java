package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public abstract class Lifesaver {
    public DeflateBehavior deflateBehavior;

    public String type;

    public String performInflating() {
        return "I'm inflating";
    }

    public String performDeflating() {
        return "I'm deflating";
    }

    public String floating() {
        return "I'm floating";
    }

    public String display() {
        return "I'm a " + type;
    }
}
