package day3.OOP;

/**
 * @author Rifki
 */
public class Persegi extends BangunDatar {

    float sisi;

    @Override
    float luas(){
        float luas = sisi*sisi;
        System.out.println("Luas dari persegi adalah "+luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4 *sisi;
        System.out.println("Keliling dari Persegi adalah "+keliling);
        return keliling;
    }
}