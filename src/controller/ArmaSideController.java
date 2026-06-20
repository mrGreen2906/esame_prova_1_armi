package controller;

import model.armi.ArmiInt;
import view.ArmaSideView;
import view.MainView;

public class ArmaSideController {
    ArmiInt m;
    ArmaSideView v;

    public ArmiInt getM() {  return m;}

    public ArmaSideView getView() {  return v;}

    public ArmaSideController(ArmiInt a){
        this.m=a;
        this.v = new ArmaSideView(a.getNome(), this);
    }

    public void seleziona(){
        ArmaCentralController a = new ArmaCentralController(this.m);
MainView.getInstance().setArmaCentrale(a);
    }

    public void aggiornaVistaArma(){
        if(m.hasNoAmmo())
            this.v.setScarica();
        else
            this.v.setCarica();
    }
}
