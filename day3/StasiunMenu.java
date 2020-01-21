package day3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rifki
 * 
 *         buat menu : +++++++++++ STASIUN +++++++++++ 1. Tampil Semua Stasiun
 *         -> Jika stasiun masih kosong, maka akan menampilkan "Belum ada
 *         stasiun" 2. Tambah Stasiun 3. Ubah Stasiun 4. Hapus Stasiun 5. Keluar
 * 
 */
public class StasiunMenu {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> stasiun = new ArrayList<String>();

        static void tampilsemuastasiun() {
            System.out.println("Tampil Semua Stasiun");
            if (stasiun.isEmpty()) {
                System.out.println("Maaf, Stasiun belum tersedia");
            } else {
                for (int i = 0; i < stasiun.size(); i++) {
                    System.out.println("Nama Stasiun ke-" + (i+1) + " = " + stasiun.get(i));
                }
            }
        }
    
        static void tambahstasiun() {
            System.out.println("Menambahkan Stasiun");
            System.out.print("Masukan jumlah stasiun yang ingin ditambahkan : ");
            int jml = in.nextInt();
            in.nextLine();
            for (int i = 1; i <= jml; i++) {
                System.out.print("Nama Stasiun ke- " + i + " = ");
                String nmstasiun = in.nextLine();
                stasiun.add(nmstasiun);
            }
        }
    
        static void ubahstasiun() {
            System.out.print("Stasiun ke berapa yang ingin anda ubah ? ");
            int brp = in.nextInt();
            in.nextLine();
            if(brp > stasiun.size()){
                System.out.println("Maaf, Belum ada stasiun pada nomor urut yang anda masukan");
            }
            else{
            System.out.print("Masukan nama stasiun yang baru : ");
            String nmbaru = in.nextLine();
            stasiun.set((brp-1), nmbaru);
                
            }
        }
    
        static void hapusstasiun() {
            System.out.print("Stasiun ke berapa yang ingin anda hapus ? ");
            int brp = in.nextInt();
            if (brp > stasiun.size()) {
                System.out.println("Maaf, Belum ada stasiun pada nomor urut yang anda masukan");
            }
            else{
            stasiun.remove(brp-1);    
            }
        }
    
        static void menu() {
            System.out.println("=========== DAFTAR MENU STASIUN ===========");
            System.out.println("||\t 1. Tampil Semua Stasiun \t||");
            System.out.println("||\t 2. Tambah Stasiun \t\t||");
            System.out.println("||\t 3. Ubah Stasiun \t\t||");
            System.out.println("||\t 4. Hapus Stasiun \t\t||");
            System.out.println("||\t 5. Keluar \t\t\t||");
            System.out.print("PILIH MENU [1-5] : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    tampilsemuastasiun();
                    System.out.println("");
                    System.out.println("");
                    menu();
                    break;
                case 2:
                    tambahstasiun();
                    System.out.println("");
                    System.out.println("");
                    menu();
                    break;
                case 3:
                    System.out.println("Ubah Stasiun");
                    tampilsemuastasiun();
                    ubahstasiun();
                    System.out.println("");
                    System.out.println("");
                    menu();
                    break;
                case 4:
                    tampilsemuastasiun();
                    hapusstasiun();
                    System.out.println("Menghapus stasiun berhasil!!");
                    System.out.println("");
                    System.out.println("");
                    menu();
                    break;
                case 5:
                    System.out.println("Keluar Menu. Terimakasih telah menggunakan layanan kami");
                    break;
                default:
                    System.out.println("Maaf, Inputan tidak tersedia/salah. Coba Ulangi lagi");
                    menu();
            }
        }
    
        public static void main(String[] args) {
            menu();
        }    
    }