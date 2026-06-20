package controller;

import model.armi.ArmiInt;
import view.ArmaCentralView;

public class ArmaCentralController {
    ArmiInt a;
    ArmaCentralView v;

    public ArmaCentralController(ArmiInt a) {
        this.a = a;
        this.v = new ArmaCentralView(this.a.getNome(), this.a.getDamage(), this.a.getAmmo(), this);

    }

    public ArmaCentralView getView() {
        return v;
    }

    public void reload(){
        this.a.reload();

    }
}
