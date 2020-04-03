package Juego.Guerreros;

import Juego.Planetas.Planeta;

public class Guerreros {

    //ATRIBUTOS

    protected String tipoGuerrero;
    protected float factorMuerte;
    protected int espacioOcupado;
    protected float valorAtaque;


    //METODOS

    //Metodo Constructor
    public Guerreros (String tipoGuerrero, float factorMuerte,int espacioOcupado,float valorAtaque){

        this.tipoGuerrero = tipoGuerrero;
        this.factorMuerte = factorMuerte;
        this.espacioOcupado = espacioOcupado;
        this.valorAtaque = valorAtaque;
    }


    //Getters

    public float getFactorMuerte(){

        return factorMuerte;
    }

    public int getEspacioOcupado(){

        return espacioOcupado;
    }

    public float getValorAtaque() {
        return valorAtaque;
    }


    //Setters

    public void setFactorMuerte(float factorMuerte){

        this.factorMuerte = factorMuerte;
    }

    public void setEspacioOcupado(int espacioOcupado) {

        this.espacioOcupado = espacioOcupado;
    }

    public void setValorAtaque(float valorAtaque) {

        this.valorAtaque = valorAtaque;
    }
}
