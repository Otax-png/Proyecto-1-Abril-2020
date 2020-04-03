package Juego;

import Juego.Tablero.tablero;

import java.util.Scanner;

public class Jugabilidad {

    private String user1 = "Terran";
    private String user2 = "Zerg";
    int option = 0;

    public void jugar() {

        Scanner entrada = new Scanner(System.in);

            System.out.println("--BIENVENIDO A KONKEST--");

            System.out.println("\n \n La guerra entre los Terran y los Zerg ha comenzado, ambos utilizaran todo su arsenal e intelecto para ganar esta guerra... \n Ya veremos quien ganará");
            System.out.println("\n Presiona enter para continuar");

            entrada.nextLine();



        do {
            System.out.println("1. Partida Rapida");
            System.out.println("2. Creador de Mapas");
            System.out.println("3. Salir");

            option = entrada.nextInt();

            if (option >= 1 && option <= 3) {

                switch (option) {
                    case 1:

                        tablero Galaxia = new tablero(3,3);
                        Galaxia.dibujarTablero();

                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                }
            }
        }while (option != 3) ;

    }
}