package model.armi.abs;

import model.armi.ArmiInt;
import model.armi.ArmiTipoEnum;
import model.bersagli.BersagliInt;
import model.exceptions.BersaglioLontano;
import model.exceptions.NoBersaglio;
import model.exceptions.NoMunizioni;

public abstract class AbstractArma implements ArmiInt {
    final String name;
    static final int CARICATORE_MAX =5;
    int numColpi, caricatore, danno;
    ArmiTipoEnum tipo;

    protected AbstractArma(String n, int d, ArmiTipoEnum t){
        this.name=n;
        this.numColpi=getColpiVolta();
        this.danno=d;
        this.caricatore=CARICATORE_MAX;
        this.tipo=t;
    }

    public String getNome(){ return this.name;    }
    public String getAmmo() { return this.caricatore+"/"+CARICATORE_MAX;}
    public String getDamage(){ return this.danno + "x"+ this.getColpiVolta();}
    public boolean hasNoAmmo() {return this.caricatore==0;}
    public final void reload(){this.caricatore= CARICATORE_MAX;}
    public ArmiTipoEnum getAte(){ return this.tipo; }


    protected abstract int getColpiVolta();
    protected abstract int getPortata();
    public final void shoot(BersagliInt b) throws NoMunizioni, BersaglioLontano {
        if(this.caricatore<this.numColpi)
            throw new NoMunizioni();
        this.caricatore-= this.numColpi;
        if(this.getPortata()<b.getDistanza())
            throw new BersaglioLontano();

        b.applicaDanni(this.numColpi*this.danno);
    }
}
