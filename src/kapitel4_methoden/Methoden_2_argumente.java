package kapitel4_methoden;

public class Methoden_2_argumente {
    // deklarieren / definieren
    static void berechne_flaeche(int hehe, int yoyo){
        int f = hehe * yoyo; // flaeche
        System.out.println(f);
        System.out.println("----------");
    }
    public static void main(String[] args) {
        int x1 = 6;
        int y1 = 3;
        // int f1 = x1 * y1; // flaeche
        // System.out.println(f1);
        // System.out.println("----------");
        berechne_flaeche(x1, y1); // aufrufen / verwenden

        int x2 = 60;
        int y2 = 30;

        berechne_flaeche(x2, y2);

        int x3 = 600;
        int y3 = 300;

        berechne_flaeche(7823, 323);
        berechne_flaeche(678, 534);
        berechne_flaeche(728, 35);


        ///////////////////
        int lina = 78;
        int mohammad = 3;
        berechne_flaeche(lina, mohammad);

        berechne_flaeche(78, 3);
        ////////////////////
//
//        int x2 = 60;
//        int y2 = 30;
//        int f2 = x2 * y2; // flaeche
//        System.out.println(f2);
//        System.out.println("----------");
//
//        int x3 = 600;
//        int y3 = 300;
//        int f3 = x3 * y3; // flaeche
//        System.out.println(f3);
//        System.out.println("----------");
//
//        int x4 = 6000;
//        int y4 = 3000;
//        int f4 = x4 * y4; // flaeche
//        System.out.println(f4);
//        System.out.println("----------");
    }
}
