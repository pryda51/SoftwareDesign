package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class TennisBall extends Ball {
    public TennisBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new NotBreakable();
        type = "Tennis ball";
    }
}
