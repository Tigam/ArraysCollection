package at.wifi.swdev.arrayscollection;

public class Kredit {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Eingabe
        double gesamtSumme = 450_000.00;
        double eigenKapital = 100_000.00;
        double zinsSatz = 0.036;
        int laufzeit = 30;
        double monatsRate = 1550.00;

        // Verarbeitung
        gesamtSumme -= eigenKapital;
        int laufzeitJahr = 1;
        while (laufzeitJahr <= laufzeit) {
            double jahresRate = monatsRate * 12;
            gesamtSumme -= jahresRate;
            if (gesamtSumme > 0) {
                gesamtSumme *= 1 + zinsSatz;
            }
            System.out.printf("Jahr %2d : %.2f EUR offen%n", laufzeitJahr, gesamtSumme);
            laufzeitJahr++;
        }

        // Ausgabe
        if (gesamtSumme > 0.0) {
            System.out.printf("Restsumme von %.2f EUR endfällig.%n", gesamtSumme);
        } else {
            System.out.printf("Guthaben von %.2f EUR.%n", Math.abs(gesamtSumme));
        }
    }

}
