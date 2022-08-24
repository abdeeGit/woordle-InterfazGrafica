/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordle_interfaces_abde;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Utente-XB
 */
public class Principal {

    ListaPalabras lista = new ListaPalabras();
    static String palabraLetras = "ABCDEFGHIJKLMN?OPQRSTUVWXYZ";
    static String LetrasEstan = "---------------------------";
    static String LetrasDescartadas = "---------------------------";

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        //TableroJuego tablero = new TableroJuego();
        System.out.println("empezar Partida 1");
        Jugador jugadorAux = new Jugador();
        jugadorAux.main(args);
        jugadorAux.setVisible(false);
        //String jugadorName= jugadorAux.devolverNombre();
        //jugadorAux.Cerrar();
        // tablero.main(args);
        System.out.println("naaombre= " + jugadorAux.nombreJugador);
    }
}
