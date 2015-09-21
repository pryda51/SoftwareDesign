package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class SoccerBall extends Ball {
    public SoccerBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        breakBehavior = new Breakable();
        type = "Soccer ball";
    }
}
