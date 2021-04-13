package at.wifi.swdev.arrayscollection;

public class Main {

    static String s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[] pixel = new int[2_000_000];

        int[] zahlen = {1, 3, 2, 4, 5, 6};        //= new int[5];

        int summe = 0;
        for (int pos = 0; pos < zahlen.length; pos++) {
            int zahl = zahlen[pos];
            //System.out.println(zahl);
            summe += zahl;
        }
        double mittelwert;
        mittelwert = (double)summe / zahlen.length;

        System.out.println("Mittelwert: " + mittelwert);

//zahlen = new int[5];
//        zahlen[0] = 42;
//        zahlen[1] = 21;
//        zahlen[2] = 13;
//        zahlen[3] = 5;
//        zahlen[4] = 99;
//        int dritteZahl = zahlen[2];
//
//        System.out.println(dritteZahl);
    }

}
