/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiobinario;

import java.util.*;

/**
 *
 * @author sebastian
 */
public class Cambiobinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese numero decimal: ");
        System.out.println(validarNumero(leerNumero()));
        calcularBinario8(leerNumero());
        if (validarNumero(leerNumero())==true){
            calcularBinario8(leerNumero());
            imrprimirResultado(int num,int a);
        }else{
            System.out.println("Error!!");
        }
    }

    public static int leerNumero() {
        int num;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        return num;
    }

    public static boolean validarNumero(int num) {
        boolean r;
        if (num <= 255 || num >= 0) {
            r = true;
            System.out.println("");
        } else {
            r = false;
        }
        return r;
    }

    public static int[] calcularBinario8(int num) {
        int i, j = 0;
        int a[] = new int[8];
        for (i = 0; i < 8; i++) {
            a[i] = 0;
        }
        while (0 != num) {
            if (0 != num % 2) {
                a[j++] = num % 2;
                num -= num % 2;
                num /= 2;
            } else {
                a[j++] = 0;
                num /= 2;
            }
        }
        int x = 0, aux;
        while ((7 - x) > x) {
            aux = a[x];
            a[x] = a[7 - x];
            a[7 - x] = aux;
            x++;
        }
        return a;
    }
    public static void imprimirResultado(int num, int [] a){
        System.out.println("Numero decimal ingresado: " + num);
        int x;
        for (x = 0; x < 8; x++) {
            System.out.print("[" + a[x] + "]");
        }
    }

}
