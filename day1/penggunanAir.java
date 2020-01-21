package day1;

import java.util.Scanner;

/**
 * @author Rifki
 * 
 * Soal :
Sebuah meteran air memiliki perhitungan penggunaan air per m3 sebagai berikut.
Jika pemakaian 45m3 maka tarif yang dikenakan adalah sebagai berikut.
10m3 pertama = 10 * 1000 	= 10000
10m3 berikutnya = 10 * 1500	= 15000
15m3 berikutnya = 15 * 2000	= 30000
10m3 sisanya = 10 * 3000	= 30000
Total				        = 85000
Buatlah konisi yang menerima total pemakaian air dan mengeluarkan nilai yang perlu dibayar. 

 */
public class penggunanAir {

    public static void main(String[] args) {
        int a, b ;
        Scanner in = new Scanner(System.in);
        System.out.println("===PERHITUNGAN PENGGUNAAN TARIF AIR===");
        System.out.print("Banyaknya air yang dipakai [m3]:");
        a = in.nextInt();

        if ( a <= 10 ){
            b = a * 1000; //untuk 10m3 pertama
        } else if ( a <= 20 ){
            b = 10000 + (a-10)*1500; // untuk 10m3 kedua, perhitungannya yaitu total dari tarif full pertama ditambah perhitungan tarif ke dua
        } else if ( a <= 35 ){
            b = 25000 + (a-20)*2000; // untuk 15m3 berikutnya, perhitungannya yaitu total dari tarif full kedua ditambah perhitungan tarif ke ketiga
        } else{
            b = 55000 + (a-35)*3000; // Selebihnya, perhitungannya yaitu total dari tarif full Ketiga ditambah perhitungan tarif ke Terakhir.
        }
        System.out.println("Harga : "+b);
        in.close();
    }
}