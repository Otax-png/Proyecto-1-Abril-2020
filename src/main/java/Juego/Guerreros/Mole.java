package Juego.Guerreros;
/**
 * Guerrero Tipo Mole
 */
public class Mole extends Guerreros {

    private int cantidadMole;

    public Mole () {

        super ("Mole",  1.5f, 1,20 );

        }


    //Getter
    public int getCantidadMole() {
        return cantidadMole;
    }

    //Setter
    public void setCantidadMole(int cantidadMole) {
        this.cantidadMole = cantidadMole;
    }


}

