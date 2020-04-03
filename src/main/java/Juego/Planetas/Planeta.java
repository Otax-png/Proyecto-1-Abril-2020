package Juego.Planetas;

public class Planeta {

    protected static int index = 0;

    //Declaracion de Atributos
    protected String nombrePlaneta;
    protected double porcentajeMuerte;
    protected int cantidadDinero;
    protected int cantidadConstructor;
    protected int cantidadNaves;
    protected int cantidadGuerreros;
    private int dineroProducido;
    protected String guerreroProducido;

    String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};


    //METODOS

    //Metodo Constructor
    public Planeta(int cantidadNaves, int cantidadGuerreros, int dineroProducido, String guerreroProducido) {

        this.nombrePlaneta = letras[index];
        this.porcentajeMuerte = (double) (Math.random());
        this.cantidadDinero = 0;
        this.cantidadConstructor = 1;
        this.cantidadNaves = 0;
        this.cantidadGuerreros = cantidadGuerreros;
        this.dineroProducido = dineroProducido;
        this.guerreroProducido = guerreroProducido;

        index++;

    }


    //Setters

    public void setCantidadDinero(int cantidadDinero) {

        this.cantidadDinero = cantidadDinero;
    }

    public void setCantidadConstructor(int cantidadConstructor) {

        this.cantidadConstructor = cantidadConstructor;
    }

    public void setCantidadNaves(int cantidadNaves) {

        this.cantidadNaves = cantidadNaves;
    }

    public void setCantidadGuerreros(int cantidadGuerreros) {

        this.cantidadGuerreros = cantidadGuerreros;
    }

    public void setDineroProducido(int dineroProducido) {

        this.dineroProducido = dineroProducido;

    }

    public void setGuerreroProducido(String guerreroProducido) {

        this.guerreroProducido = guerreroProducido;
    }


    //getters

    public String getNombrePlaneta() {

        return nombrePlaneta;
    }

    public int getCantidadDinero() {

        return cantidadDinero;
    }

    public int getCantidadConstructor() {
        return
                cantidadConstructor;
    }

    public int getCantidadNaves() {

        return cantidadNaves;
    }

    public int getCantidadGuerreros() {

        return cantidadGuerreros;
    }

    public int getDineroProducido() {

        return dineroProducido;
    }

    public String getGuerreroProducido() {

        return guerreroProducido;
    }

}


    /*

     */