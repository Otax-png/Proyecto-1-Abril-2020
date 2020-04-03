package Juego.Guerreros;

/**
 * Guerrero Tipo Groot
 */
public class Groot extends Guerreros {

    private int cantidadGroot;

    public Groot(String tipoGuerrero, float factorMuerte, int espacioOcupado, float valorAtaque, int cantidadGroot) {
        super("Groot", 1.85f, 3, valorAtaque);
        this.cantidadGroot = cantidadGroot;
    }


    //Getter
    public int getCantidadGroot() {
        return cantidadGroot;
    }

    //Setter
    public void setCantidadGroot(int cantidadGroot) {
        this.cantidadGroot = cantidadGroot;
    }
}
