package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;

public class PingPongBall extends Ball {
    public PingPongBall() {
        setBounceBehavior(bounceBehavior);

        //bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        breakBehavior = new Breakable();
        type = "PingPong ball";
    }
}
