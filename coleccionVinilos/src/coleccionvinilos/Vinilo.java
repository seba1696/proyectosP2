/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionvinilos;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sebastian
 */
public class Vinilo {

    private String nomArtista;
    private String nomVinilo;
    private String agno;

    Vinilo(String nomArt, String nomVin, String year) {
        this.nomArtista = nomArt;
        this.nomVinilo = nomVin;
        this.agno = year;
    }

    public void mostrarVinlo() {
        String msj = "";
        msj = "\t" + this.nomArtista;
        msj += "\t" + this.nomVinilo;
        msj += "\t" + this.agno;
        System.out.println(msj);
    }

    public String getNomArtista() {
        return nomArtista;
    }

    public void setNomArtista(String nomArtista) {
        this.nomArtista = nomArtista;
    }

    public String getNomVinilo() {
        return nomVinilo;
    }

    public void setNomVinilo(String nomVinilo) {
        this.nomVinilo = nomVinilo;
    }

    public String getAgno() {
        return agno;
    }

    public void setAgno(String agno) {
        this.agno = agno;
    }

    String leer() throws IOException {
        String a = null;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        a = leer.readLine();
        return a;
    }

}
