package controller.comparators;

import controller.ArmaSideController;
import model.armi.comparatori.ArmiByTypeComparatore;

import java.util.Comparator;

public class ArmiControllerByNameComparatore implements Comparator<ArmaSideController> {
    @Override
    public int compare(ArmaSideController o1, ArmaSideController o2) {
        return new ArmiByTypeComparatore().compare(o1.getM(), o2.getM());
    }
}
