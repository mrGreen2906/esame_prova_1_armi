package view;

import controller.ArmaSideController;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;



public class ArmaSideView extends StackPane {

    Rectangle r;
    Text t;
    public ArmaSideView(String nome, ArmaSideController c){
        r = new Rectangle(100, 30);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(5);
        r.setFill(Color.GRAY);
        t = new Text(nome);


        this.getChildren().add(r);
        this.getChildren().add(t);
        this.setEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED,
                actionEvent -> { c.seleziona(); });

    }

    public void setScarica(){this.r.setFill(Color.RED);}
    public void setCarica(){this.r.setFill(Color.GRAY);}
}


