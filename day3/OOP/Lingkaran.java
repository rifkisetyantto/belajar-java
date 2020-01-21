package day3.OOP;

/**
 * @author Rifki
 */
public class Lingkaran extends BangunDatar {

    float r;

    // diberikan anotasi Override untuk membuat programmer mudah memahami bahwa
    // method tersebut juga digunakan pada parent class
    @Override
    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran adalah " + luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling lingkaran adalah " + keliling);
        return keliling;
    }

}