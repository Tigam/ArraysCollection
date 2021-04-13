package at.wifi.swdev.arrayscollection;

import java.util.Arrays;

public class Median {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Medianberechnung
        int[] zahlen = {42, 21, 13, 5, 99, 10000000};
        // Verarbeitung
        // 1) Sortieren
        Arrays.sort(zahlen);
        double median = 0.0;
        if (zahlen.length % 2 != 0) {
            // 2a) Mitte bei ungerader Anzahl
            int pos = zahlen.length / 2;
            median = zahlen[pos];
        } else {
            // 2b) arithm Mittel bei gerader Anzahl
            int posB = zahlen.length / 2;
            int posA = posB - 1;
//            median = (zahlen[zahlen.length / 2 - 1] + zahlen[zahlen.length / 2]) / 2.0;
            median = (zahlen[posA] + zahlen[posB]) / 2.0;
        }
        // Ausgabe
        //System.out.println(Arrays.toString(zahlen));
        System.out.printf("Median: %.2f%n", median);
    }

}
