package Juego.Planetas;

public class Radioactivo extends Planeta {

    private static int cantidad;
    private float PorcentajeMuerte;

    public Radioactivo() {
        super(0, 0, 0, "Fision Guy");
        this.PorcentajeMuerte = (float) (Math.random());
        cantidad = cantidad++;
    }




}
