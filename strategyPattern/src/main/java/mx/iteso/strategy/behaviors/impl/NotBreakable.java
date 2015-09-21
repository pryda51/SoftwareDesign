package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.BreakBehavior;

public class NotBreakable implements BreakBehavior {
    public String Break() {
        return "I can't break!";
    }
}
