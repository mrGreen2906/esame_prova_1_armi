package view;

import com.sun.tools.javac.Main;
import controller.ArmaCentralController;
import controller.BersaglioController;
import controller.InventarioController;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainView extends BorderPane {

    static MainView istanza;
    InventarioController ic;
    ArmaCentralController a;
    BersaglioController b;
    HBox box;

    public static MainView getInstance(){
        if(istanza== null)
            istanza = new MainView();
        return istanza;
    }
    private MainView(){
        ic = new InventarioController();
        this.setLeft(ic.getView());
    }
}
