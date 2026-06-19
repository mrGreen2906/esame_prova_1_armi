package model.bersagli;

public interface BersagliInt {
    int getDistanza();
    int getVita();
    boolean isDead();
    void applicaDanni(int d);
}
