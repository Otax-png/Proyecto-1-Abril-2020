package Juego.Guerreros;
/**
 * Guerrero Tipo Nemo
 */
public class Nemo extends Guerreros {

   private int cantidadNemo;

   public Nemo (String tipoGuerrero, float factorMuerte, int espacioOcupado, float valorAtaque, int cantidadNemo){
       super( "Nemo", 1.6f,1,valorAtaque);
       this.cantidadNemo = cantidadNemo;
   }


   //Getter
    public int getCantidadNemo() {
        return cantidadNemo;
    }

    //Setter
    public void setCantidadNemo(int cantidadNemo) {
       this.cantidadNemo = cantidadNemo;
    }
}
