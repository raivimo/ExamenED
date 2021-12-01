/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examened;

/**
 *
 * @author examened
 */
public class Reto2 {
    public static void main(String[] args) {
        int[]numeros = new int [1000];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(i+1);
            System.out.println("Este es el número: " + numeros[i]);
        }
    }
}
