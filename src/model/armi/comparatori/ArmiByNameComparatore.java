package model.armi.comparatori;

import model.armi.ArmiInt;

import java.util.Comparator;

public class ArmiByNameComparatore implements Comparator<ArmiInt> {
    @Override
    public int compare(ArmiInt o1, ArmiInt o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
