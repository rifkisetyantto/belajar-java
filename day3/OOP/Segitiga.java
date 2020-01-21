package day3.OOP;

/**
 * @author Rifki
 */
public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    float luas(){
        float luas = alas*tinggi;
        System.out.println("Luas dari segitiga adalah "+luas);
        return luas;
    }
}