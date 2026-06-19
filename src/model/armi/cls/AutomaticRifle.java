package model.armi.cls;

import model.armi.abs.AbstractRifle;

public class AutomaticRifle extends AbstractRifle {

    public AutomaticRifle(String n, int d){
        super(n,d);
    }

    @Override
    protected int getColpiVolta() {
        return 3;
    }
}
