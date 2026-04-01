import java.util.Random;
import java.util.Scanner;

public class ornek17 {
    /*
     * Piyango oyunu
     * Sistem iki basamaklı bir sayı üretmeli
     * Kullanıcıdan da bu sayıyı tahmin etmesini istiyoruz
     * 
     * Eğer kullanıcı sayının tamamını doğru bilirse 10.000 tl
     * Eğer kullanıcı sayının basamaklarını bilirse yani 65 yerine 56 yazmışsa
     * 5000TL
     * Eğer kullanıcı şanslı numaranın sadece bir basaamağını bilirse 1000 TL
     * kazanır
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int para = 0;
        int sansliSayi = rnd.nextInt(90)+ 10;
        System.out.println("şanslı sayı "+sansliSayi);
        System.out.println(" İki basamaklı tahmininizi giriniz");
        int tahmin = giris.nextInt();
        int tBas1 = tahmin % 10;
        int tBas2 = tahmin / 10;
        int sBas1 = sansliSayi % 10;
        int sBas2 = sansliSayi / 10;
        System.out.println("Şanslı sayı ="+sansliSayi);
        System.out.println("Tahmin edilen sayi ="+tahmin);
        if (tahmin == sansliSayi) {
            para += 10000;
            System.out.println("Tebrikler. Şanslı sayıyı bildiniz.Kazanilan para : " + para);
        } else if (tBas1 == sBas2 && tBas2 == sBas1) {
            para += 5000;
            System.out.println("Şanslı sayının rakamlarını bildiniz.Kazanılan para = " + para);
        } else if (tBas1 == sBas1 || tBas1 == sBas2 || tBas2 == sBas1 || tBas2 == sBas2) {
            para += 1000;
            System.out.println("Şanslı sayının bir tane rakamını doğru bildiniz.Kazanılan para =" + para);
        }else{
            System.out.println("Maalesef tutturamadınız.");
        }
    }
}