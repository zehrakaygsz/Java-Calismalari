import java.util.Scanner;

public class ornek9 {
    public static void main(String[] args) {
        // lavyeden girilen bir sayının tam bölenlerini ekrana yazdırınız.
        Scanner giris = new Scanner(System.in);
        while (true) {
            System.out.println("cikis icin 0 giriniz:");
            System.out.println("Sayi giriniz:");
            int sayi = giris.nextInt();
            if (sayi == 0) {
                break;
            } else {
                System.out.println("Tam bölenleri hesaplanıyor...");
                for (int i = 1; i <= sayi; i++) {
                    if (sayi % i == 0) {
                        System.out.println(" sayinin " + " carpanlari " + " = " + i + " dir.");
                    } else
                        continue;
                }
            }
        }

    }
}
