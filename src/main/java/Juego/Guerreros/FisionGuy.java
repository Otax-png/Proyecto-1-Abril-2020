package Juego.Guerreros;

/**
 * Guerrero Tipo FisionGuy
 */
public class FisionGuy extends Guerreros {

    private int cantidadFG;

   public FisionGuy (String tipoGuerrero, float factorMuerte, int espacioOcupado, float valorAtaque, int cantidadFisionGuy) {

       super("Fision Guy", 1.95f,4,valorAtaque);

       this.cantidadFG = cantidadFisionGuy;

   }

   //Setter
   public void setCantidadFG(int cantidadFG) {

   }

   //Getter
   public int getCantidadFG() {
       return cantidadFG;
   }

}
