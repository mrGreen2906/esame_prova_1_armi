package model;

import model.armi.ArmiInt;
import model.armi.cls.AutomaticRifle;
import model.armi.cls.ShotGun;
import model.armi.cls.SimpleGun;

import java.util.ArrayList;

public class Inventory extends ArrayList<ArmiInt> {
    static Inventory istanza = null;
    public static Inventory getInventario(){
        if(istanza == null)
            return new Inventory();
        else
            return istanza;
    }

    private Inventory(){
        AutomaticRifle g36e = new AutomaticRifle("G36E",20);
        SimpleGun glock = new SimpleGun("Glock", 15);
        ShotGun benelli = new ShotGun("Benelli M4", 10);

        this.add(g36e);
        this.add(glock);
        this.add(benelli);
    }
}
