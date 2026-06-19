package controller;

import model.armi.ArmiInt;
import view.ArmaSideView;
import view.MainView;

public class ArmaSideController {
    ArmiInt m;
    ArmaSideView v;

    public ArmiInt getM() {  return m;}

    public ArmaSideView getV() {  return v;}

    public ArmaSideController(ArmiInt a){
        this.m=a;
        this.v = new ArmaSideView(a.getNome(), this);
    }

    public void seleziona(){
        ArmaCentralController acc = new ArmaCentralController(this.m);
        MainView.getIstance().set
    }

    public void aggiornaVistaArma(){
        if(m.hasNoAmmo())
            this.v.setScarica();
        else
            this.v.setCarica();
    }
}
