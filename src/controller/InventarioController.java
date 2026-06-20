// controller/InventarioController.java
package controller;

import controller.comparators.ArmiControllerByNameComparatore;
import controller.comparators.ArmiControllerByTypeComparatore;
import model.Inventory;
import model.armi.ArmiInt;
import model.armi.comparatori.ArmiByNameComparatore;
import model.armi.comparatori.ArmiByTypeComparatore;
import view.InventarioView;
import view.MainView;

import java.util.ArrayList;
import java.util.List;

public class InventarioController {
    Inventory m;
    InventarioView v;
    List<ArmaSideController> cs;

    public InventarioController() {
        this.m = Inventory.getInventario();
        this.cs = new ArrayList<>();
        for (ArmiInt a : this.m) {
            ArmaSideController asc = new ArmaSideController(a);
            this.cs.add(asc);
        }

        drawView();
    }

    private void drawView() {
        this.v = new InventarioView();
        for (ArmaSideController a : this.cs)
            this.v.getChildren().add(a.getView());
        this.aggiornaMunizioni();
    }

    public void sortByName() {
        this.cs.sort(new ArmiControllerByNameComparatore());
        this.m.sort(new ArmiByNameComparatore());
        drawView();
        MainView.getInstance().setLeft(this.v);
    }

    public void sortByType() {
        this.cs.sort(new ArmiControllerByTypeComparatore());
        this.m.sort(new ArmiByTypeComparatore());
        drawView();
        MainView.getInstance().setLeft(this.v);
    }

    public InventarioView getView() {
        return this.v;
    }

    public void aggiornaMunizioni() {
        for (ArmaSideController a : this.cs)
            a.aggiornaVistaArma();
    }
}