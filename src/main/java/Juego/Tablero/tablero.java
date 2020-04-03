package Juego.Tablero;

public class tablero {
    /**
    *   Tablero
     */
    private int filas;
    private int column;

    casillas [] [] Galaxia;

   //Metodo Constructor
    public tablero(int x, int y){

        //Filas y columnas de tablero
        this.filas = x;
        this.column = y;

        Galaxia = new casillas [x] [y];

            for (int i = 0; i < filas; i++){
                for (int j = 0; j < column ; j++){
                    Galaxia [i] [j] = new casillas(i,j);
                }
            }
    }

    /*public void colorearCasillas() {

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < column; j++){
                Galaxia[i][j].setColorCasilla(ANSI_BLACK_BACKGROUND);
            }
        }

    }*/

    public void dibujarTablero() {

        for (int y = 0; y < column ; y++){
            for (int i = 0; i < 4; i++){
                for(int x = 0; x < filas; x++)
                    System.out.println(Galaxia[x][y].getLine(i));
                    System.out.println("");
            }
            System.out.println("");
        }
    }

    //Getter
    public int getFilas(){
        return filas;
    }

    public int getColumn() {
        return column;
    }
    //Setter

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setColumn(int column) {
        this.column = column;
    }

}