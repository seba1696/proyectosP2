/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodados;

/**
 *
 * @author sebastian
 */
public class Juego {

    private Dado dado1, dado2, dado3;

    Juego() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void jugar() {
        dado1.setNumero();
        dado2.setNumero();
        if (dado1.getNumero() + dado2.getNumero() == 7) {
            System.out.println("Gano juego");
        } else {
            System.out.println("Pierde juego");
        }
    }
}
