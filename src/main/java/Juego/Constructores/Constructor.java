package Juego.Constructores;

import Juego.Naves.NabooN1;

public class Constructor {

    protected String nombreObrero;
    protected int precioCompra;
    protected int precioVenta;


    public Constructor(String nombreObrero, int precioCompra, int precioVenta) {
        this.nombreObrero = nombreObrero;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    //Getters
    public String getNombreObrero() {
        return nombreObrero;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }



    //SETTERS
    public void setNombreObrero(String nombreObrero) {
        this.nombreObrero = nombreObrero;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }


    /*
    Metodos para construccion de naves
     */
    public void construirNaboo () {

    }

    public void construirXwing () {

    }

    public void construirMillenialFalcon () {

    }

    public void construirStarDestroyer () {

    }

}
