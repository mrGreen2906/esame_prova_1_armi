package controller.comparators;

import controller.ArmaSideController;
import model.armi.comparatori.ArmiByNameComparatore;

import java.util.Comparator;

public class ArmiControllerByTypeComparatore implements Comparator<ArmaSideController> {
    @Override
    public int compare(ArmaSideController o1, ArmaSideController o2) {
        return new ArmiByNameComparatore().compare(o1.getM(), o2.getM());
    }
}
