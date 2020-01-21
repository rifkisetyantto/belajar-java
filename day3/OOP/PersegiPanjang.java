package day3.OOP;

/**
 * @author Rifki
 */
public class PersegiPanjang extends BangunDatar {

    float panjang;
    float lebar;

    @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas dari persegi panjang adalah "+luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 2 * panjang * lebar;
        System.out.println("Keliling dari persegi panjang adalah "+keliling);
        return keliling;
    }
}