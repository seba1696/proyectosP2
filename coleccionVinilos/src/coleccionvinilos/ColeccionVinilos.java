/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionvinilos;

import java.util.*;

/**
 *
 * @author sebastian
 */
public class ColeccionVinilos {
    String artista = null, nombre = null, year = null;
    Vinilo vi = new Vinilo(artista, nombre, year);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String artista = null, nombre = null, year = null;
        ArrayList<Vinilo> colecVinilos = new ArrayList<Vinilo>();
        colecVinilos.ensureCapacity(100);
        agregarVinilo(colecVinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(colecVinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(colecVinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(colecVinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(colecVinilos, "AC-DC", "Highway to Hell", "1979");
        agregarVinilo(colecVinilos, "AC-DC", "Who made who", "1986");
        agregarVinilo(colecVinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(colecVinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(colecVinilos, "Judas Priest", "Defenders of the faith", "1984");
        agregarVinilo(colecVinilos, "Kiss", "Destroyer", "1976");
        System.out.println("Cantidad de vinilos: " + colecVinilos.size());
        System.out.println("Espacios disponibles: " + (100 - colecVinilos.size()));
        mostrarColeccion(colecVinilos);
        mostrarBusquedaArtista(colecVinilos,"Kiss");
        mostrarBusquedaArtista(colecVinilos,"AC-DC");

    }

    public static void agregarVinilo(ArrayList<Vinilo> vin, String artista, String nombre, String year) {
        Vinilo vi = new Vinilo(artista, nombre, year);
        artista = vi.getNomArtista();
        nombre = vi.getNomVinilo();
        year = vi.getAgno();
    }

    public static boolean buscarArtista(ArrayList<Vinilo> vin, String artista) {
        int i;
        for (i = 0; i < vin.size(); i++) {
            if (vin.get(i) == vi.getNomArtista()) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void mostrarBusquedaArtista(ArrayList<Vinilo> vin, String artista) {
        if (buscarArtista(vin, artista) == true) {
            System.out.println(vin);
        }
    }

    public static void mostrarColeccion(ArrayList<Vinilo> vis) {
        for (Vinilo vi : vis) {
            vi.mostrarVinilo();
        }

    }

}
