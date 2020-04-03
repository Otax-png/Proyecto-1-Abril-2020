package Juego.Constructores;

import Juego.Naves.MillenialFalcon;
import Juego.Naves.NabooN1;
import Juego.Naves.Xwing;

public class Arquitecto extends Constructor {

    private int cantidadArquitecto;

    //Constructor
    public Arquitecto() {
        super("Arquitecto", 250, 175);
        cantidadArquitecto++;
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


}
