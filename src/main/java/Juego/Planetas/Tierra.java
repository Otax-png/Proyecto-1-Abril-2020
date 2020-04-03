package Juego.Planetas;
import Juego.Guerreros.Mole;

public class Tierra extends  Planeta {

    Mole GuerreoMole = new Mole();
    private static int cantidad;

    /**
     * Planeta Tipo Tierra
     */
    public Tierra(int cantidadNaves, int dineroProducido, String guerreroProducido) {
        super(0, 0, 0,"Mole");
        cantidad++;

    }



    public void generarGuerreros() {
        cantidadGuerreros = cantidadGuerreros + (GuerreoMole.getCantidadMole() * ((int) (Math.random() * 25) + 15));
    }

}

