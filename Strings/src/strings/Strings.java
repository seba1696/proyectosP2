/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author sebastian
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Ingrese mensaje.");
        String cadena;
        cadena = leerString();
        imprimirResultados(cadena);
    }

    public static String leerString() {
        String str;
        Scanner leer = new Scanner(System.in);
        str = leer.nextLine();
        return str;
    }

    public static int largoCadena(String str) {
        return str.length();
    }

    public static int contarVocales(String str) {
        str = str.toLowerCase();
        int i, cont;
        cont = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public static int contarConsonantes(String str) {
        str = str.toLowerCase();
        int i, cont;
        cont = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                cont++;
            }
        }
        return cont;
    }

    public static String invertirString(String str) {
        StringBuilder builder = new StringBuilder(str);
        String invertido = builder.reverse().toString();
        return invertido;
    }

    public static char leerChar() throws IOException {
        char ch;
        ch = (char) System.in.read();
        return ch;
    }

    public static boolean existeChar(String str, char ch) throws IOException {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println("La letra '" + ch + "' existe");
                return true;
            }
        }
        return false;
    }

    public static String Leer() {
        String substr;
        Scanner leer = new Scanner(System.in);
        substr = leer.nextLine();
        return substr;
    }

    public static boolean existeSubString(String str, String substr) {
        int cont = 0;
        while (str.indexOf(substr) > -1) {
            str = str.substring(str.indexOf(substr) + substr.length(), str.length());
            cont++;
        }
        if (cont > -1) {
            System.out.println("Existe sub cadena:");
            return true;
        } else {
            return false;
        }
    }

    public static void imprimirResultados(String str) throws IOException {
        char a;
        String b;
        System.out.println("-------------------------------------");
        System.out.println("Mensaje: " + str);
        System.out.println("Largo de cadena es: " + largoCadena(str));
        System.out.println("Cantidad de vocales es: " + contarVocales(str));
        System.out.println("Cantidad de consonantes: " + contarConsonantes(str));
        System.out.println("Mensaje invertido: " + invertirString(str));
        System.out.println("Caracter que quiere comprobar: ");
        a = leerChar();
        System.out.println("Existencia de caracter: " + existeChar(str, a));
        System.out.println("Sub-cadena que quiere comprobar:");
        b = Leer();
        System.out.println("Existencia de subcadena: " + existeSubString(str, b));
    }
}
