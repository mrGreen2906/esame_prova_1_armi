package controller;

import javafx.scene.control.Alert;
import model.armi.ArmiInt;
import model.exceptions.BersaglioLontano;
import model.exceptions.NoBersaglio;
import model.exceptions.NoMunizioni;
import model.exceptions.ShootingException;
import view.ArmaCentralView;
import view.MainView;

public class ArmaCentralController {
    ArmiInt a;
    ArmaCentralView v;

    public ArmaCentralController(ArmiInt a) {
        this.a = a;
        this.v = new ArmaCentralView(this.a.getNome(), this.a.getDamage(), this.a.getAmmo(), this);

    }

    public ArmaCentralView getView() {
        return v;
    }

    public void reload() {
        this.a.reload();
        aggiornaArmiView();
    }

    public void shoot() {
        try {
            BersaglioController b = MainView.getInstance().getBersaglioController();
            this.a.shoot(b.getModel());
            aggiornaArmiView();
            b.applyDamage();
        } catch (NoBersaglio e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Bersaglio mancante");
            a.showAndWait();

        } catch (NoMunizioni e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Colpi insufficienti");
            a.showAndWait();
        } catch (BersaglioLontano e) {
            aggiornaArmiView();
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Fuori range (colpi sprecati)");
            a.showAndWait();

        } catch (ShootingException e) {
            System.out.println("errore");
        }
    }

    private void aggiornaArmiView() {
        this.v.setAmmo(this.a.getAmmo());
        MainView.getInstance().getIc().aggiornaMunizioni();
    }
}
