import java.util.Scanner;

public class ornek18 {
    /*
     * Klavyeden girilen sayıları okuyan ve sayıların toplamı 21'den büyük veya
     * eşit olduğu zaman duran programın kodlarını yazınız
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int toplam = 0;
        System.out.print("sayi giriniz:");
        int sayi = giris.nextInt();
        toplam += sayi;
        System.out.println(" Girilen sayi"+sayi);

        while (toplam < 21) {
            System.out.println("sayi giriniz:");
            System.out.println(" Girilen sayi "+" "+sayi);
            sayi = giris.nextInt();
            toplam += sayi;

        }
        System.out.println("Girilen sayılar toplamı ="+" "+toplam);
    }
}
