package day2;

/**
 * @author Rifki
 */
public class BintangSegitiga {

    public static void main(String[] args) {
        System.out.println("BINTANG SEGITIGA SIKU");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("BINTANG SEGITIGA SIKU TERBALIK");
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("BINTANG SEGITIGA SAMA SISI");
        int tinggi = 10;
        int bintang = 1;
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bintang; k++) {
                System.out.print("*");
            }
            bintang+=2;
            System.out.println("");
        }
    }
}