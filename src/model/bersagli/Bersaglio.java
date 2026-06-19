package model.bersagli;

public class Bersaglio implements BersagliInt {
    final static int VITA_MAX = 100;
    int distanza, vitaAttuale;
    protected Bersaglio (int d){
        this.distanza=d;
        this.vitaAttuale=VITA_MAX;
    }

    @Override
    public int getDistanza() {
        return this.distanza;
    }

    @Override
    public int getVita() {
        return this.vitaAttuale;
    }

    public void applicaDanni(int danno){
        this.vitaAttuale-=danno;
    }
    public boolean isDead() { return vitaAttuale<=0;}
}
