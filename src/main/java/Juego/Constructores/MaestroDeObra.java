package Juego.Constructores;

import Juego.Naves.NabooN1;
import Juego.Naves.Xwing;

public class MaestroDeObra extends Constructor {

    private int cantidadMO;

    //Constructor
    public MaestroDeObra() {
        super("Maestro de Obra", 100, 70);
        cantidadMO++;
    }

    @Override
    public void construirNaboo() {
        NabooN1 NaveN1 = new NabooN1();
    }

    @Override
    public void construirXwing(){
        Xwing NaveX1 = new Xwing();
    }

}
