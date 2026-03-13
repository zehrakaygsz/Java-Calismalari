import java.util.Scanner;
import java.math.*;

public class z8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1den 100e kadar olan çift sayıları ekrana yazdıran program
        int k = 1;
        while (k <= 100) {
            if (k % 2 == 0) {
                System.out.println("k = " + k);
            }
            k++;
        }
        System.out.println("**************** YENİ ÖRNEK ****************");
        // negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden tek sayıları toplayan program
        int sayi;
        int toplam = 0;
        System.out.println("sayi giriniz:");
        sayi = input.nextInt();
        if (sayi % 2 == 1) {
            toplam += sayi;
        } else {
            toplam = 0;
        }

        while (sayi > 0) {
            System.out.println("Sayi giriniz :");
            sayi = input.nextInt();

            if (sayi < 0) {
                System.out.println("Döngü bitmistir.Toplam=" + toplam + "dir.");
                break;
            } else {
                if (sayi % 2 == 1) {
                    toplam += sayi;
                }
                System.out.println("Girilen tek degerlerin toplami= " + toplam + "dir.");

            }

        }
        System.out.println("******************YENİ ÖRNEK********************");
        // Girilen sayıya kadar olan 2nin kuvvetlerini yazdır.
        int deger;
        int z = 2;
        System.out.println("Pozitif Sayi giriniz.");
        deger = input.nextInt();
        System.out.println("girilen sayi = " + deger);
        while (z <= deger) {

            System.out.println(z);
            z = z * 2;
        }

    }
}
