/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.swdev.arrayscollection;

/**
 *
 * @author dev
 */
public class Gauss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int summe = 0;
//        for (int g = 1; g <= 100; g++) {
//            summe += g;
//        }
        int g = 1;
        while (g <= 100) {
            summe += g;
            g++;
        }
        

        System.out.println("Summe = " + summe);
    }

}
