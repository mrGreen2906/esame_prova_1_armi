package model.armi.comparatori;

import model.armi.ArmiInt;

import java.util.Comparator;

public class ArmiByTypeComparatore implements Comparator<ArmiInt> {
    @Override
    public int compare(ArmiInt o1, ArmiInt o2) {
        int r1 =  o1.getAte().compareTo(o2.getAte());

        if(r1==0)
            return new ArmiByNameComparatore().compare(o1,o2);
        return r1;
    }
}
