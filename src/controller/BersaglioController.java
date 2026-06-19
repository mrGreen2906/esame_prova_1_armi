// controller/BersaglioController.java
package controller;
import model.bersagli.BersagliInt;
import view.BersaglioView;

public class BersaglioController {
    private BersagliInt m;
    public BersaglioController(BersagliInt b) { this.m = b; }
    public BersagliInt getModel() { return m; }
    public BersaglioView getView() { return null; }
}