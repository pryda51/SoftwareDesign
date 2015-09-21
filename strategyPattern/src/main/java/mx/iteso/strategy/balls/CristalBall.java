package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class CristalBall extends Ball {
    public CristalBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new Crash();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new Breakable();
        type = "Cristal ball";
    }
}
