package Juego.Naves;

public class StarDestroyer extends naves {

    static public int cantidadSD;

//METODOS
    //constructor

    public StarDestroyer() {
        super("Star Destroyer", 80, 1.75f, 100);
        cantidadSD++;
    }
}
