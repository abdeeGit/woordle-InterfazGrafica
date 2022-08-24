/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordle_interfaces_abde;

import java.util.Arrays;
import static wordle_interfaces_abde.Principal.sc;

public class Jugada {
// lo hago de este modo para repasar el tema de variables finales y acceso a ellas desde otros ficheros

    private ListaPalabras listaPalabras = new ListaPalabras();
    private final char[] letrasPosibles = Principal.palabraLetras.toCharArray();
    private final char[] letrasFind = new char[5];
    private final char[] letrasNotFind = new char[5];
    private int intentos = 6;// empieza con 6 intentos
    private char[] nombrePalabra;// palabra original recuperada
    private char[] palabraOculta;//palabra oculta que ira variando
    private char[] palabraEscrita;// palabra escrita del usuario

    // hago lo de abajo Asi para despues poder modificarlo por CORRECTO de manera Sencilla
    public int PalabraLengh() {
        return nombrePalabra.length;
    }

    public void CargarJuego() {
        // a la hora de iniciar jugada recupero la palabra
        //ListaPalabras listaAux = new ListaPalabras();
        listaPalabras.cargarPalabras();
        nombrePalabra = listaPalabras.RecuperarRandPalabra().toCharArray();
        palabraOculta = new char[nombrePalabra.length];// lo inicializamos 
        palabraEscrita = new char[nombrePalabra.length];// lo inicializamos 
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '-';
            palabraEscrita[i] = '-';
        }
        //  palabraEscrita = palabraOculta;
    }

    public void mostrarJuego() {
        //   System.out.println("palabraOculta= " + Arrays.toString(palabraOculta));
        System.out.println("Comenzamos a jugar \n");
        int evitarBucle = 0;
        String mostrarIntentos = "";
        do {
            mostrarIntentos = "Te quedan " + this.getIntentos() + "  Intentos.";

            mostrarParametrosJuego(mostrarIntentos);
            System.out.print("Introduce una palabra de " + PalabraLengh() + " letras: ");
            String palabra = sc.next().toUpperCase();
            comprobarPalabraEscrita(palabra);
            comprobarLetrasPalabra();
            /*System.out.println("mostrar de nuevo SI 1");
            evitarBucle = sc.nextInt();*/
        } while (!palabraEncontrada() && intentos > 0);// comporbar esto!!
        if (Arrays.equals(palabraEscrita, palabraOculta)) {
            mostrarIntentos = "** CORRECTO **";
        } else {
            mostrarIntentos = "** Fin Partida **";
        }
        mostrarParametrosJuego(mostrarIntentos);
    }

    public void comprobarLetrasPalabra() {
        System.out.println("llega a comprobar letras");
        for (int i = 0; i < palabraEscrita.length; i++) {
            char letraEscrita = palabraEscrita[i];
            int posicionLetrasPosibles = recuperarPosicionLetra(letrasPosibles, letraEscrita);// por que haciendolo asi funciona si lo tengo como vector
            if (palabraTieneLetra(nombrePalabra, letraEscrita)) {
                //digamos que esa letra esta en la palabra
                //  int posicionLetra = recuperarPosicionLetra(palabraEscrita, letraEscrita);// recuperamos posicion
                if (nombrePalabra[i] == letraEscrita) {
                    palabraOculta[i] = letraEscrita;
                } else if (palabraOculta[i] == '-') {
                    palabraOculta[i] = '*';
                    // se ha encontrado Tabien 
                }
                // System.out.println("posicion  letras p?sibles de " + letraEscrita + " -> " + recuperarPosicionLetra(letrasPosibles, letraEscrita));

                letrasFind[i] = letraEscrita;

            } else {
                // se a?ade a la palabra descartada
                if (palabraOculta[i] == '*' ) {
                    //if (palabraOculta[i] == '*' && !Character.isLetter(letraEscrita)) {
                    palabraOculta[i] = '-';
                }
                if (palabraTieneLetra(letrasPosibles, letraEscrita)) {
                    //si sigue teniendlas es decir no se ha cambiado por -
                    letrasNotFind[i] = letraEscrita;
                    letrasPosibles[i] = '-';
                }
                //intentos--;
            }
        }
        //comprobarIntentos();//  por lo visto lo intentos van bajando no hay que comprobar nada
        intentos--;
    }

    public void comprobarIntentos() {
        boolean bajarIntentos = true;
        for (char c : palabraEscrita) {
            for (char d : palabraOculta) {
                if (c == d) {
                    bajarIntentos = false;
                }
            }
        }
        if (bajarIntentos) {
            intentos--;
        }
    }

    public char[] getNombrePalabra() {
        return nombrePalabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setNombrePalabra(char[] nombrePalabra) {
        this.nombrePalabra = nombrePalabra;
    }

    public void comprobarPalabraEscrita(String palabraAux) {
        while (palabraAux.length() != PalabraLengh()) {
            System.out.println("Palabra De Tamanio Incorrecto");
            System.out.println("Dime Palabra de " + PalabraLengh());
            palabraAux = sc.next();
        }
        // se supone que pone la palabra correctamente
        palabraEscrita = palabraAux.toCharArray();
    }

    public int recuperarPosicionLetra(char[] vectorA, char letra) {
        int indice = 0;// la inicializamos con valor incorrecto
        for (int i = 0; i < vectorA.length; i++) {
            char aux = vectorA[i];
            if (aux == letra) {
                indice = i;
            }
        }
        return indice;
    }

    public void mostrarParametrosJuego(String mostrarIntentos) {
        String palabraEscritaAux = chartoString(palabraEscrita);
        String palabraOcultaAux = chartoString(palabraOculta);
        String letrasPosiblesAux = chartoString(letrasPosibles);
        String letrasFindAux = chartoString(letrasFind);
        String letrasNotFindAux = chartoString(letrasNotFind);

        // me falta  formater dichos valores por Estetica
        System.out.println(mostrarIntentos + " - Letras posibles: " + letrasPosiblesAux);
        System.out.println(palabraEscritaAux + "\t\t\t - Letras están: " + letrasFindAux);
        System.out.println(palabraOcultaAux + "\t\t\t - Letras descartadas: " + letrasNotFindAux);

    }

    public boolean palabraEncontrada() {
        boolean encontrada = false;
        if (chartoString(palabraOculta).equals(chartoString(nombrePalabra))) {
            encontrada = true;
        }
        return encontrada;
    }

    public String chartoString(char[] vector) {// ya que quiero trabajar con  vector de char
        String palabra = "";
        for (char c : vector) {
            if (c != ' ') {
                palabra += c;
            }
        }
        return palabra;
    }

    public ListaPalabras getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ListaPalabras listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    public char[] getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(char[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public char[] getPalabraEscrita() {
        return palabraEscrita;
    }

    public void setPalabraEscrita(char[] palabraEscrita) {
        this.palabraEscrita = palabraEscrita;
    }

    public boolean palabraTieneLetra(char[] palabraAux, char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabraAux.length; i++) {// porque con el foreach no lo pia
            if (palabraAux[i] == letra) {
                encontrada = true;
            }
        }
        return encontrada;
    }

    public static void main(String[] args) {
        Jugada juga = new Jugada();
        System.out.println("lleha");
        String nombre = "abdea";
        char[] nombreVector = new char[]{'a', 'b', 'd', 'e'};
        System.out.println(Arrays.toString(nombreVector));
        System.out.println(Arrays.toString(nombre.toCharArray()));

        if (nombre.equals(juga.chartoString(nombreVector))) {
            System.out.println("son iguales ");
        }
        String abdel = "abdee";
        System.out.println(juga.letrasPosibles.toString().toCharArray());
        System.out.println(juga.recuperarPosicionLetra(abdel.toCharArray(), 'e'));
    }

    public char[] getLetrasPosibles() {
        return letrasPosibles;
    }

    public char[] getLetrasFind() {
        return letrasFind;
    }

    public char[] getLetrasNotFind() {
        return letrasNotFind;
    }

}
