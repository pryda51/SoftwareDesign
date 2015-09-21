package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class BaseballBall extends Ball {
    public BaseballBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new Breakable();
        type = "Baseball ball";
    }
}
