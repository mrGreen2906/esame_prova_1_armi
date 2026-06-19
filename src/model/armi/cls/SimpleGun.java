package model.armi.cls;

import model.armi.abs.AbstractGun;

public class SimpleGun extends AbstractGun {
    public SimpleGun(String n, int d) {
        super(n, d);
    }

    @Override
    protected int getColpiVolta() {
        return 1;
    }
}
