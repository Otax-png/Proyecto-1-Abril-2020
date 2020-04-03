package Juego.Tablero;

public class casillas {

    //Atributos

    private int posX;
    private int posY;
    private String colorCasilla;
    private String colorPlanetasNeutral;


    private String [] figuraCasilla =  {"|*¯¯¯*¯¯¯*¯¯¯*¯¯¯*¯¯¯*¯¯*|",
                                        "|  *   *   *   *   *   * |",
                                        "|*   *   *   *   *   *  *|",
                                        "|__*___*___*___*___*___*_|"};

    private String [] figuraPlanetaNeutral =   {"|¯*¯¯*¯¯*¯¯*¯¯*¯¯*¯¯*¯¯*¯|",
                                                "| Nombre "+" *  *  *  *  * |",
                                                "| Neutral  *   *   *    *|",
                                                "|  *   *    *   *  *    *|",
                                                "|*___*____*___*___*___*__|"};

    private String [] figuraAgua;

    //METODOS


   //Metodo Constructor
    public casillas(int posX ,int posY ){

        //Planeta = null;
        this.posX = posX;
        this.posY = posY;
        this.colorCasilla = " ";
        this.colorPlanetasNeutral = "white";


    }

    //GETTERS

    public String getColorCasilla() {
        return colorCasilla;
    }


    public String getColorPlanetasNeutral() {
        return colorPlanetasNeutral;
    }


    //SETTERS

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setColorCasilla(String colorCasilla) {
        this.colorCasilla = colorCasilla;
    }


    public void setColorPlanetasNeutral(String colorPlanetasNeutral) {
        this.colorPlanetasNeutral = colorPlanetasNeutral;
    }

    public String getLine(int pos){

        return figuraCasilla[pos];
    }
}
