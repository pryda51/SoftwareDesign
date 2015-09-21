package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.BreakBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;

public abstract class Ball {
    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public BreakBehavior breakBehavior;
    public String type;


    public Ball() {

    }


    public String roll() {
        return type + " is rolling!";
    }

    public void setBounceBehavior(BounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public String getBounceBehavior() {
        return this.bounceBehavior.bounce();
    }

    /*public String performBounce() {
        return bounceBehavior.bounce();
    }*/

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performBreak() {
        return breakBehavior.Break();
    }
}
