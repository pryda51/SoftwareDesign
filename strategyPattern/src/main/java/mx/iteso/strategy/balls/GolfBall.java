package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class GolfBall extends Ball {
    public GolfBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new NotBreakable();
        type = "Golf ball";
    }
}
