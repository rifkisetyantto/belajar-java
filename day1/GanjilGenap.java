package day1;

import java.util.Scanner;

/**
 * @author Rifki
 */
public class GanjilGenap {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Masukan bilangan : ");
     int bil = in.nextInt();
     
     if (bil%2==0) {
         System.out.println(bil+" Adalah bilangan genap");
     } else {
         System.out.println(bil+" Adalah bilangan ganjil");
     }
     System.out.println();
     System.out.println("================================");
     System.out.println("Bilangan genap dari 1 sampai 100");
     System.out.println("================================");
     for (int i = 1; i <= 100; i++) {
         if (i%2 == 0) {
             if (i==100) {
                 System.out.println(i);
             } else{
                 System.out.print(i+", ");
             }
         }
     }
     System.out.println();
     System.out.println("================================");
     System.out.println("Bilangan ganjil dari 1 sampai 100");
     System.out.println("================================");
     for (int i = 1; i <= 100; i++) {
         if (i%2 != 0) {
            if (i==99) {
                System.out.println(i);
            } else{
                System.out.print(i+", ");
            }
         }
     }
     in.close();
    }
}