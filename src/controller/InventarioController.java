// controller/InventarioController.java
package controller;
import model.Inventory;
import model.armi.ArmiInt;
import view.InventarioView;
import view.MainView;

import java.util.ArrayList;
import java.util.List;

public class InventarioController {
    Inventory m;
    InventarioView v;
    List<ArmaSideController> cs;
    public InventarioController() {
        this.m =Inventory.getInventario();
        this.cs = new ArrayList<>();
        for(ArmiInt a : this.m){
            ArmaSideController asc = new ArmaSideController(a);
            this.cs.add(asc);
        }

        drawView();
    }

    private void drawView() {
    }

    public void sortByName(){
        this.cs.sort(new Arma);
    }

    public InventarioView getView() { return new InventarioView(); }
}