package model.armi.abs;

import model.armi.ArmiTipoEnum;

public abstract class AbstractGun extends AbstractArma{
    protected AbstractGun (String n , int d) {
        super(n, d, ArmiTipoEnum.GUN);
    }

    protected final int getPortata() {
        return 20;
    }

}
