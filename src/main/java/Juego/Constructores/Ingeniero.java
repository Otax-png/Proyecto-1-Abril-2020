package Juego.Constructores;

import Juego.Naves.MillenialFalcon;
import Juego.Naves.NabooN1;
import Juego.Naves.StarDestroyer;
import Juego.Naves.Xwing;

public class Ingeniero extends Constructor {

    private int cantidadIngeniero;

    //Constructor
    public Ingeniero() {
        super("Ingeniero", 300, 200);
        cantidadIngeniero++;
    }

    @Override
    public void construirNaboo(){
        NabooN1 Nabbo1 = new NabooN1();
    }

    @Override
    public void construirXwing(){
        Xwing Xwing1 = new Xwing();
    }

    @Override
    public void construirMillenialFalcon(){
        MillenialFalcon Nabbo1 = new MillenialFalcon();
    }

    @Override
    public void construirStarDestroyer(){
        StarDestroyer ST1 = new StarDestroyer();
    }

}
