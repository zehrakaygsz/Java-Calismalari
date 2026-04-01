import java.util.Scanner;

public class ornek12 {
    public static void main(String[] args) {
        /*
         * Klavyeden girilen bir tam sayının asal sayı olup olmadığını bulan programın
         * kodlarını yazınız, (sadece 1 ve kendisine
         * tam bölünebilen sayılara asal sayı denir.)
         */
        Scanner giris = new Scanner(System.in);

        int bolensayisi = 0;
        while (true) {
            System.out.println("çıkmak icin 0 giriniz.");
            System.out.println("Sayi giriniz:");
            int sayi = giris.nextInt();
            if (sayi == 0) {
                System.out.println("sıfır girildi.cikiliyor.");
                break;
            } else {
                bolensayisi = 0;
                for (int i = 1; i <= sayi; i++) {
                    if (sayi % i == 0) {
                        bolensayisi++;
                        System.out.println("bölündüğü sayilar=" + i);
                    }
                }
                if (bolensayisi == 2)
                    System.out.println("asal sayidir.");
                else
                    System.out.println("asal değildir.");
                continue;
            }
        }
    }
}
