import java.util.Scanner;

public class ornek14 {
    public static void main(String[] args) {
        // Kullanıcı ekrana 0 girene kadar sayı isteyen ve toplamını
        // yazan program
        /*
         * 
         * System.out.println("Sayi giriniz:");
         * int sayi = giris.nextInt();
         * int toplam = 0;
         * toplam += sayi;
         * while (sayi!= 0) {
         * System.out.println("Cıkmak icin 0 tuslayiniz.");
         * System.out.println("Sayi giriniz:");
         * sayi = giris.nextInt();
         * toplam += sayi;
         * }
         * System.out.println("Girilen sayilarin toplamı ="+toplam);
         */
        Scanner giris = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        System.out.println("Cıkmak icin 0 tuslayiniz.");
        do {
            System.out.println("sayi giriniz:");
            sayi = giris.nextInt();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println("Girilen sayilarin toplamı =" + toplam);
    }
}
