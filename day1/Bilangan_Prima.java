package day1;

/**
 * @author Rifki
 * 
 * membuat program bilangan prima dari 2 - 100 karna bilangan prima adalah bilangan asli yang lebih besar dari angka 1
 * yang faktor pembagiannya adalah 1 dan bilangan itu sendiri.
 */
public class Bilangan_Prima {

    public static void main(String[] args) {
        int batas = 100; //inisialisasi variable 'batas' dengan nilai = 100
        System.out.println(" Bilangan prima dari 1 sampai 100");
        for (int i = 2; i < batas ; i++) { //untuk melooping nilai dari 2 - 100
            boolean bilPrima = true; //membuat inisialisasi variable logika 'bilPrima' dengan kondisi 'true'

            for (int j = 2; j < i ; j++) { // melooping kembali nilai hasil dari perulangan yang pertama
                if (i%j==0) {
                    bilPrima = false;
                    break;
                }
            }
            /**
             * Jika hasil dari sisa bagi looping yang pertama dan kedua adalah 0, maka kondisi variable logika
             * akan berubah menjadi 'false' dan perulangan di blok kedua akan berhenti.
             */
            if (bilPrima == true) { //pada blok program ini akan mencetak hasil nilai yang terakhir berhasil di looping
                System.out.print(i+", ");
            }
        }
    }
}