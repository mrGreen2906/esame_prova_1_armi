package model.bersagli;

public class BersaglioFactory {
    public static Bersaglio creaBersVicino () { return new Bersaglio(20);}
    public static Bersaglio creaBersMedio () { return new Bersaglio(40);}
    public static Bersaglio creaBersLontano () { return new Bersaglio(80);}
}
