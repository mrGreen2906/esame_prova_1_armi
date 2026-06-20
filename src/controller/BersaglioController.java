// controller/BersaglioController.java
package controller;
import model.bersagli.BersagliInt;
import view.BersaglioView;
import view.MainView;

public class BersaglioController {
    BersagliInt m;
    BersaglioView v;
    public BersaglioController(BersagliInt b) {
        this.m = b;
        this.v = new BersaglioView(m.getVita(), m.getDistanza());
    }
    public BersagliInt getModel() { return m; }
    public BersaglioView getView() { return v; }

    public void applyDamage(){
        this.v.aggiornHP(this.m.getVita()+"");
        if (this.m.isDead()){
            MainView.getInstance().setBersaglioCentrale(null);
        }
    }
}