package model.armi.cls;

import model.armi.abs.AbstractRifle;

public class SniperRifle extends AbstractRifle {
    protected SniperRifle(String n, int d) {
        super(n, d);
    }

    @Override
    protected int getColpiVolta() {
        return 1;
    }
}
