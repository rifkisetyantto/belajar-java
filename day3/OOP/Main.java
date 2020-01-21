package day3.OOP;

/**
 * @author Rifki
 */
public class Main {

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();

        bd.luas();
        bd.keliling();

        Lingkaran l = new Lingkaran();

        l.r=10;
        l.luas();
        l.keliling();

        Persegi p = new Persegi();

        p.sisi=10;
        p.luas();
        p.keliling();

        PersegiPanjang pp = new PersegiPanjang();

        pp.panjang=10;
        pp.lebar=10;
        pp.luas();
        pp.keliling();

        Segitiga sg = new Segitiga();
        sg.alas = 10;
        sg.tinggi = 20;
        sg.luas();
    }
}