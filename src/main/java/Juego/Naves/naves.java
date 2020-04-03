package Juego.Naves;

public class naves {

    //Atributos

    protected String nombreNave;
    protected int capacidadTrasnporte;
    protected float  velocidadTransporte;
    protected int costoProduccion;


    public naves(String nombreNave, int capacidadTrasnporte, float velocidadTransporte,int costoProduccion){
        this.nombreNave = nombreNave;
        this.capacidadTrasnporte = capacidadTrasnporte;
        this.velocidadTransporte = velocidadTransporte;
        this.costoProduccion = costoProduccion;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public int getCapacidadTrasnporte() {
        return capacidadTrasnporte;
    }

    public float getVelocidadTransporte() {
        return velocidadTransporte;
    }

    public int getCostoProduccion() {
        return costoProduccion;
    }
}
