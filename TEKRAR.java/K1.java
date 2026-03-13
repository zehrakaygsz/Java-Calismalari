import java.util.Random;
import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        boolean oyunDurum1 = false;
        Random rastgele = new Random();
        int sayi = rastgele.nextInt(50);
        for (int i = 0; i < 5; i++) {
            System.out.println("0-50 Arasi tahmini giriniz:");
            int tahmin = giris.nextInt();
            if ((tahmin < 0) || (tahmin > 50)) {
                System.out.println("Lutfen 0-50 arasi sayi giriniz!");
                continue;
            } else {
                if (sayi < tahmin) {
                    System.out.println("Asagi ininiz.Kalan Hak : " + (4 - i));
                } else if (sayi > tahmin) {
                    System.out.println("Yukari cikiniz.Kalan Hak : " + (4 - i));
                } else if (sayi == tahmin) {
                    System.out.println("Dogru bildiniz.Tebrikler.");
                    oyunDurum1 = true;
                    if (oyunDurum1 == true)
                        break;
                    break;
                }
            }

        }
        System.out.println("1. Etap tahmin hakkiniz bitti.");

        System.out.println("**********NEW GAME*********** ");
        int tahmin1;
        int can = 0;
        int sayi1 = rastgele.nextInt(100);
        boolean oyunDurum = false;
        System.out.println("HOSGELDİNİZ");

        while (can < 10) {
            can++;
            System.out.println("0-100 Arasi tahmininizi giriniz:");
            tahmin1 = giris.nextInt();
            if ((tahmin1 < 0) || (tahmin1 > 100)) {
                System.out.println("Lutfen 0-100 arasi sayi giriniz!");
                continue;
            } else {
                if (tahmin1 < sayi1) {
                    System.out.println("Yukari cikiniz: Kalan Hak :" + (10 - can));
                } else if (tahmin1 > sayi1) {
                    System.out.println("Asagi ininiz:Kalan Hak " + (10 - can));
                } else {
                    System.out.println("Dogru Bildiniz. Tebrikler!");
                    oyunDurum = true;
                    if (oyunDurum == true)
                        break;
                }
            }

        }
        System.out.println("2. Etap bitmistir.");
    }
}