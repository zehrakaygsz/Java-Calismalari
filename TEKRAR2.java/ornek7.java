import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {
        /*
         * Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra,
         * kullanıcıya “Tekrar Hesaplama Yapmak
         * İstiyormusunuz?” diye soru sorup, eğer kullanıcı “e” tuşuna basarsa yeniden
         * işlemleri gerçekleştiren program,
         */
        Scanner giris = new Scanner(System.in);
        /*
         * int sayi1,sayi2,toplam=0;
         * String secim;
         * 
         * do{
         * System.out.println("2 sayi giriniz:");
         * sayi1=giris.nextInt();
         * sayi2=giris.nextInt();
         * toplam=sayi1+sayi2;
         * System.out.println("Toplam sonucu ="+toplam);
         * System.out.println("Tekrar islem yapmak icin e tuslayiniz");
         * giris.nextLine();
         * secim=giris.nextLine();
         * }while(secim.equals("e"));
         */
        int sayi1, sayi2, toplam = 0;
        String secim;
        System.out.println("2 sayi giriniz:");
        sayi1 = giris.nextInt();
        sayi2 = giris.nextInt();
        toplam = sayi1 + sayi2;
        System.out.println("Toplam sonucu =" + toplam);
        System.out.println("Tekrar islem yapmak icin e tuslayiniz");
        giris.nextLine();
        secim = giris.nextLine();
        while (secim.equals("e")) {
            System.out.println("2 sayi giriniz:");
            sayi1 = giris.nextInt();
            sayi2 = giris.nextInt();
            toplam = sayi1 + sayi2;
            System.out.println("Toplam sonucu =" + toplam);
            System.out.println("Tekrar islem yapmak icin e tuslayiniz");
            giris.nextLine();
            secim = giris.nextLine();
        }

    }

}
