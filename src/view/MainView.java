package view;

import com.sun.tools.javac.Main;
import controller.ArmaCentralController;
import controller.BersaglioController;
import controller.InventarioController;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.bersagli.BersaglioFactory;


public class MainView extends BorderPane {

    static MainView istanza;
    InventarioController ic;
    ArmaCentralController a;
    BersaglioController b;
    HBox box;

    public static MainView getInstance() {
        if (istanza == null)
            istanza = new MainView();
        return istanza;
    }

    private MainView() {
        ic = new InventarioController();
        this.setLeft(ic.getView());

        Button bon = new Button("Ordina per nome");
        bon.setOnAction(event -> ic.sortByName());
        Button bot = new Button("Ordina per tipo");
        bot.setOnAction(event -> ic.sortByType());

        HBox hb = new HBox();
        hb.getChildren().add(bon);
        hb.getChildren().add(bot);
        hb.setSpacing(10);
        this.setTop(hb);

        Button bv = new Button("Bersaglio vicino");
        bv.setOnAction(event -> {
            this.b = new BersaglioController(BersaglioFactory.creaBersVicino());
            this.setBersaglioCentrale(this.b);
        });
        Button bm = new Button("Bersaglio medio");
        bm.setOnAction(event -> {
            this.b = new BersaglioController(BersaglioFactory.creaBersMedio());
            this.setBersaglioCentrale(this.b);
        });
        Button bl = new Button("Bersaglio lontano");
        bl.setOnAction(event -> {
            this.b = new BersaglioController(BersaglioFactory.creaBersLontano());
            this.setBersaglioCentrale(b);
        });

        VBox vbox = new VBox();
        vbox.getChildren().add(bv);
        vbox.getChildren().add(bm);
        vbox.getChildren().add(bl);
        vbox.setSpacing(10);
        this.setRight(vbox);

        this.box = new HBox();
        box.setSpacing(10);
        this.setCenter(box);
    }


    public void setArmaCentrale(ArmaCentralController a) {
        this.a = a;
        this.box = new HBox();
        this.box.getChildren().add(this.a.getView());
        if (this.b != null){
            this.box.getChildren().add(this.b.getView());
        }
        this.setCenter(this.box);
    }

    public void setBersaglioCentrale(BersaglioController c) {
        this.b = c;
        this.box = new HBox();
        if (this.a != null){
            this.box.getChildren().add(this.a.getView());
        }
        if (this.b != null)
            this.box.getChildren().add(this.b.getView());
        this.setCenter(this.box);
    }

}
