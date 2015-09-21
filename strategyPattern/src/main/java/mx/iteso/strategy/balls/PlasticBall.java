package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class PlasticBall extends Ball {
    public PlasticBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new NotBreakable();
        type = "Plastic ball";
    }
}
