package model.armi.cls;

import model.armi.abs.AbstractGun;

public class ShotGun extends AbstractGun {

    protected ShotGun(String n, int d) {
        super(n, d);
    }

    @Override
    protected int getColpiVolta() {
        return 5;
    }
}
