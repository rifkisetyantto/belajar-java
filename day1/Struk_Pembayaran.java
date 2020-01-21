package day1;

import java.util.Scanner;

/**
 * @author Rifki Soal : Struk pembayaran
 * 
 *    cek kondisi, punya kartu member atau tidak? kalo member : dapet diskon member 10ribu.
 * Jika belanjaannya > 500rebu maka dapet diskon 50rebu 
 * Jika belanjaannya > 300rebu maka dapet diskon 30rebu 
 * Jika belanjaannya > 100rebu maka dapet diskon 10rebu 
 * Minimal supaya dapet diskon adalah 25rebu.
 * 
 *    Kalo bukan member : ga dapet diskon member 
 * Jika belanjanya > 500rebu maka dapet diskon 30rebu 
 * Jika belanjanya > 300rebu maka dapet diskon 10rebus 
 * Jika belanja < 300rebu ga dapet diskon
 * 
 */
public class Struk_Pembayaran {

    public static void main(String[] args) {
        int totalBelanja = 0;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("=====================================");
        System.out.println("===== S T R U K   B E L A N J A =====");
        System.out.println("=====================================");
        System.out.print("Punya kartu member nya ? [Y/N]");
        char member = in.next().charAt(0);

        if (member == 'Y' || member == 'y') {
            System.out.println();
            System.out.println("Selamat!!! anda berkesempatan mendapatkan diskon senilai Rp.10.000,- dari kartu member anda");
            System.out.println("Untuk mendapatkan diskon dari kartu member anda, minimum pembelanjaan anda harus Rp.25.000,-");
            System.out.println();
            System.out.print("Total belanja anda berapa ? Rp.");
            int harga = in.nextInt();
            if (harga > 500000) {
                System.out.println("Anda mendapatkan diskon tambahan sebesar Rp.50.000,-");
                totalBelanja = totalBelanja + harga - 60000;
            } else if (harga > 300000) {
                System.out.println("Anda mendapatkan diskon tambahan sebesar Rp.30.000,-");
                totalBelanja = totalBelanja + harga - 40000;
            } else if (harga > 100000) {
                System.out.println("Anda mendapatkan diskon tambahan sebesar Rp.10.000,-");
                totalBelanja = totalBelanja + harga - 20000;
            } else if (harga >= 25000) {
                System.out.println("Anda mendapatkan diskon dari kartu member sebesar Rp.10.000,-");
                totalBelanja = totalBelanja + harga - 10000;
            } else {
                System.out.println("Mohon maaf diskon tidak tersedia untuk pembelanjaan kurang dari Rp.25.000,-");
                totalBelanja = totalBelanja + harga;
            }
            System.out.println();
            System.out.println("========================================================================");
            System.out.println("\t Total Belanjaan Yang Harus Anda Bayar Adalah Rp."+totalBelanja);
            System.out.println("========================================================================");
        }
        else if (member == 'N' || member == 'n'){
            System.out.println();
            System.out.print("Total belanja anda berapa ? Rp.");
            int harganon = in.nextInt();
            if(harganon > 500000){
                System.out.println("Selamat!!! anda mendapatkan diskon sebesar Rp.30.000,-");
                totalBelanja = totalBelanja + harganon - 30000;
            } else if (harganon > 300000){
                System.out.println("Selamat!!! anda mendapatkan diskon sebesar Rp.10.000,-");
                totalBelanja = totalBelanja + harganon - 10000;
            } else {
                System.out.println("Terima kasih telah berbelanja di toko kami. jika berkenan silahkan daftar member untuk mendapatkan keuntungan yang lebih :) ");
                totalBelanja = totalBelanja + harganon;
            }
            System.out.println();
            System.out.println("========================================================================");
            System.out.println("\t Total Belanjaan Yang Harus Anda Bayar Adalah Rp."+totalBelanja);
            System.out.println("========================================================================");
        }
        in.close();
    }
}