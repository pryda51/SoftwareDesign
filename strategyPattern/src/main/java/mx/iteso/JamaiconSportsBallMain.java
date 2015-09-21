package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;
import mx.iteso.strategy.behaviors.impl.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball american = new AmericanFootballBall();
        Ball base = new BaseballBall();
        Ball cristal = new CristalBall();
        Ball golf = new GolfBall();
        Ball pingpong = new PingPongBall();
        Ball plastic = new PlasticBall();
        Ball soccer = new SoccerBall();
        Ball tennis = new TennisBall();


        System.out.println(american.roll());
        american.setBounceBehavior(new IrregularBounce());
        System.out.println(american.getBounceBehavior());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performBreak());

        System.out.println();

        System.out.println(base.roll());
        base.setBounceBehavior(new IrregularBounce());
        System.out.println(base.getBounceBehavior());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performBreak());

        System.out.println();

        System.out.println(cristal.roll());
        cristal.setBounceBehavior(new Crash());
        System.out.println(cristal.getBounceBehavior());
        System.out.println(cristal.performDeflate());
        System.out.println(cristal.performInflate());
        System.out.println(cristal.performBreak());

        System.out.println();

        System.out.println(golf.roll());
        golf.setBounceBehavior(new IrregularBounce());
        System.out.println(golf.getBounceBehavior());
        System.out.println(golf.performDeflate());
        System.out.println(golf.performInflate());
        System.out.println(golf.performBreak());

        System.out.println();

        System.out.println(pingpong.roll());
        pingpong.setBounceBehavior(new NormalBounce());
        System.out.println(pingpong.getBounceBehavior());
        System.out.println(pingpong.performDeflate());
        System.out.println(pingpong.performInflate());
        System.out.println(pingpong.performBreak());

        System.out.println();

        System.out.println(plastic.roll());
        plastic.setBounceBehavior(new NormalBounce());
        System.out.println(plastic.getBounceBehavior());
        System.out.println(plastic.performDeflate());
        System.out.println(plastic.performInflate());
        System.out.println(plastic.performBreak());

        System.out.println();

        System.out.println(soccer.roll());
        soccer.setBounceBehavior(new NormalBounce());
        System.out.println(soccer.getBounceBehavior());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performBreak());

        System.out.println();

        System.out.println(tennis.roll());
        tennis.setBounceBehavior(new NormalBounce());
        System.out.println(tennis.getBounceBehavior());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(tennis.performBreak());
    }
}
