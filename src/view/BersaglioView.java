// view/BersaglioView.java
package view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import model.bersagli.Bersaglio;

public class BersaglioView extends StackPane {
    Circle c;
    Text t;

    public BersaglioView(int hp, int dist) {
        c = new Circle();
        c.setFill(Color.GREEN);
        c.setRadius(dist);
        t = new Text(hp + "");
        this.getChildren().add(c);
        this.getChildren().add(t);
    }


    public void aggiornHP(String s) {
        this.t.setText(s);
    }
}