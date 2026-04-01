import java.util.Scanner;

public class ornek11 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        

        do {
            int toplam=0;
            System.out.println("çikmak icin 0 giriniz");
            System.out.println("Sayi giriniz:");
            int sayi = giris.nextInt();
            if (sayi == 0) {
                break;
            } else {
                for (int i = 1; i < sayi; i++) {
                    if (sayi % i == 0)
                        toplam += i;
                }
                System.out.println("Tam bölenleri toplami :" + toplam);
                if (sayi == (toplam)) {
                    System.out.println("Mükemmel sayidir.");
                } else {
                    System.out.println("Mükemmel sayi değildir.");
                }
            }
        } while (true);

    }
}
