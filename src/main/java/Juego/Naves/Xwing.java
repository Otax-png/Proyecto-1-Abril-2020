package Juego.Naves;

public class Xwing extends naves{

    static public int cantidadNave;

    public Xwing() {
        super("X-Wing",42, 1.25f, 50);
        cantidadNave++;
    }
}
