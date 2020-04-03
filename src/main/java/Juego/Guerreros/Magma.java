package Juego.Guerreros;

/**
 * Guerrero Tipo Magma
 */
public class Magma extends Guerreros{

    private int cantidadMagma;

    public Magma(String tipoGuerrero, float factorMuerte, int espacioOcupado, float valorAtaque, int cantidadMagma) {
        super("Magma", 1.75f, 2, valorAtaque);
        this.cantidadMagma = cantidadMagma;
    }


    //Getter
    public int getCantidadMagma() {
        return cantidadMagma;
    }

    //Setter
    public void setCantidadMagma(int cantidadMagma) {
        this.cantidadMagma = cantidadMagma;
    }


}
