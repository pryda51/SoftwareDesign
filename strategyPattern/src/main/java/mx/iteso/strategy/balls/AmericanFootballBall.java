package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        breakBehavior = new Breakable();
        type = "American Football ball";
    }
}
