/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordle_interfaces_abde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static wordle_interfaces_abde.Principal.rand;

/**
 * @author alumno
 */
public class ListaPalabras {

    static char[] letras = Principal.palabraLetras.toCharArray();
    public ArrayList<String> listaPalabrasExistentes = new ArrayList();// nuestra Lista de Palabras Posibles
    static ArrayList<Character> listaCaracteres = new ArrayList<>() {
        {
            for (char c : letras) {
                add(c);
            }
        }
    };
    static ArrayList<String> ficheros = new ArrayList<>();

    public void cargarPalabras() {

        // Cargamos la lista de Ficheros 
        escribirFicheros();
        // l recooremos Recorriendo Todas las Palabras y A?adiendolas al Array de Palabras
        for (String fichero : ficheros) {
            recuperarPalabrasTotales("FicherosPalabras" + File.separator + fichero);// modificar Esto
        }
    }

    public static void escribirFicheros() {
        File fichero;
        //No ponemos el final paracerar el Ficheros ya que solo listamos el directorios ning?n momento hemos accedido al Contenido
        try {
            // abrimos el El Directorio
            fichero = new File("FicherosPalabras");
            String lista[] = null;
            if (fichero.isDirectory()) {
                lista = fichero.list();
                for (int i = 0; i < lista.length; i++) {
                    ficheros.add(lista[i]);
                }
            } else {
                //System.out.println("  " + ficheroAux.toString());
            }
            /* for (String string : ficheros) {
                System.out.println(string);
            }*/
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void recuperarPalabrasTotales(String rutaFichero) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //  String ficheroRelaativo = "FicherosPalabras/d.txt";//  EL fichero debe estare en  junto con las carpeta  src(Wordle-Abdee\)
            archivo = new File(rutaFichero);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim().toUpperCase();
                // comprobar masculino y femenino
                if (linea.length() == 5 && linea.matches("^[A-Z]*$")) {
                    listaPalabrasExistentes.add(linea);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String RecuperarRandPalabra() {
        int numero = rand.nextInt(listaPalabrasExistentes.size()) + 0;
        return listaPalabrasExistentes.get(numero);
    }

    static public String DevuelveDiferenciaString(String palabraA, String palabraB) {
        Jugada juga = new Jugada();
        char tempArray[] = (palabraA + palabraB).toCharArray();
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length - 1; i++) {
            if (tempArray[i] == tempArray[i + 1]) {
                tempArray[i] = ' ';
            }
        }
        String palabraReturn = juga.chartoString(tempArray);
        return palabraReturn;
    }

    //Este Metodo no  lo emplee al final 
    public static boolean palabraInValida(String palabraAux) {
        boolean PalabraValid = false;
        for (char c : palabraAux.toCharArray()) {
            if (!listaCaracteres.contains(c)) {
                PalabraValid = true;
            }
        }
        return PalabraValid;
    }

    public static void main(String[] args) {
        System.out.println(DevuelveDiferenciaString("abdee", "abdeeDev"));
    }

}
