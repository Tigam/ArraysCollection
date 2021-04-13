package at.wifi.swdev.arrayscollection;

public class Schleifen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Schleifenbeispiele");
//        int i = 0;
//        for (; i < 10; ) {
//            System.out.println(i);
//            i++;
//        }
//        
//        
//        int zaehler = 0;
//        while (zaehler < 10) {
//            System.out.println(zaehler);
//            zaehler++;
//        }

//        for (int i = 1; i <= 20; i += 2) {
//            if (i % 5 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
        int i = 1;
        while (i <= 20) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
            i += 2;
        }

//        for (int i = 10; i > 0; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Start");
    }

}
