/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;

import java.util.Random;

/**
 *
 * @author sebastian
 */
public class Dado {
    private int numero;
    Dado(){}
    Dado(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero = numero;
    }
    public void setNumero(){
        Random azar = new Random();
        numero = azar.nextInt(6)+1;
        this.numero = numero;
    }
}
