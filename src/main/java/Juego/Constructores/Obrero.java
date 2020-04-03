package Juego.Constructores;

import Juego.Naves.NabooN1;

public class Obrero extends Constructor {

    private static int cantidadObrero;

    //constructor
    public Obrero() {
        super("Obrero", 50, 40);
        cantidadObrero++;
    }

    @Override
    public void construirNaboo() {
        NabooN1 Nabbo1 = new NabooN1();
    }
}
