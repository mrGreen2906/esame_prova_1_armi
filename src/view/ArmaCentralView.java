// view/ArmaCentralView.java
package view;

import controller.ArmaCentralController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class ArmaCentralView extends VBox {

    StackPane s;
    Rectangle r;
    VBox v;
    Text t1, t2, t3;
    Button b;

    public ArmaCentralView(String n, String a, String m, ArmaCentralController c) {
        s = new StackPane();
        r = new Rectangle(120, 60);
        r.setFill(Color.DARKKHAKI);
        v = new VBox();
        v.setAlignment(Pos.TOP_LEFT);
        t1 = new Text(n);
        t2 = new Text(a);
        t3 = new Text(m);
        b = new Button("RICARICA");
        b.setOnAction(event -> {
            c.reload();
        });

        v.getChildren().add(t1);
        v.getChildren().add(t2);
        v.getChildren().add(t3);
        v.setAlignment(Pos.CENTER);

        s.getChildren().add(r);
        s.getChildren().add(v);
        this.getChildren().add(s);
        this.getChildren().add(b);
        this.setAlignment(Pos.CENTER);
    }

    public void setAmmo(String s){}

}
