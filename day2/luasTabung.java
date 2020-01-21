package day2;

import java.util.Scanner;

/**
 * @author Rifki
 */
public class luasTabung {
        static double KelilingLingkaran(double r){
            double keliling = 2 * 3.14 * r;
            return keliling;
        }
        
        static double LuasTabung(double t, double r){
            double luastbng = KelilingLingkaran(r)*(t+r);
            return luastbng;
        }
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double r,t;
            System.out.print("Masukan jari-jari : ");
            r = in.nextDouble();
            System.out.print("Mauskan Tinggi Tabung : ");
            t = in.nextDouble();
            
            System.out.println("");
            System.out.println("Hasil dari Luas Tabung adalah "+LuasTabung(t,r));

            in.close();
        }
    }