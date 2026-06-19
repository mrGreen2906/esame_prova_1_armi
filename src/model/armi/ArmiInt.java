package model.armi;

import model.bersagli.BersagliInt;
import model.exceptions.BersaglioLontano;
import model.exceptions.NoMunizioni;

public interface ArmiInt {

    String getNome();
    void reload();
    String getAmmo();
    String getDamage();
    boolean hasNoAmmo();
    ArmiTipoEnum getAte();
    void shoot(BersagliInt b) throws NoMunizioni, BersaglioLontano;
}
