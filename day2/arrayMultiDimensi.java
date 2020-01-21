package day2;

import java.util.Scanner;

/**
 * @author Rifki
 */
public class arrayMultiDimensi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan Jumlah Baris Tempat Duduk : ");
        int b = in.nextInt();
        System.out.print("Masukan Jumlah Tempat Duduk Dalam Satu Baris : ");
        int k = in.nextInt();

        in.nextLine();
        String duduk[][] = new String[b][k];
        System.out.println("");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("Siapa yang duduk di meja " + (i+1) + " - " + (j+1) + " = ");
                duduk[i][j] = in.nextLine();
            }
            System.out.println("----------------------------------");
        }

        System.out.println("");
        System.out.println("=====================");
        for (String[] i : duduk) {
            for (String j : i) {
                System.out.print(j + " | ");
            }
            System.out.println("");
        }
        in.close();
    }

}