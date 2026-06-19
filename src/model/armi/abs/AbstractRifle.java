package model.armi.abs;

import model.armi.ArmiTipoEnum;

public abstract class AbstractRifle extends AbstractArma{
    protected AbstractRifle (String n, int d){
        super(n,d, ArmiTipoEnum.RIFLE);
    }

    protected final int getPortata() {return 100;}

}
