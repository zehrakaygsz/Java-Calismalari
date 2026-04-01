import java.util.Scanner;

public class ornek15 {
    public static void main(String[] args) {
        /*
         * kullanıcı şifreyi dogru girerse sisteme giriş yapsın.
         * kullanıcının şifre için üç deneme hakkı olsun.
         * hakları bittiğinde hesabınız bloke oldu yazsın.
         * eger ki giriş doğruysa giriş başarılı yazsın.
         */

        Scanner giris = new Scanner(System.in);
        String kullaniciAdi ="zehramsi77";
        String sifre = "123Barcelona";
        int hak = 0;
        String ad, parola;
        while (hak < 3) {
            hak++;
            System.out.println("Kullanıcı adınızı giriniz:");
            ad = giris.nextLine();
            if (!ad.equalsIgnoreCase(kullaniciAdi) ) {
                System.out.println("Yanlis kullanici adi girdiniz.Tekrar deneyiniz.Kalan hak =" + (3 - hak));
            } else {
                System.out.println("Dogru kullanıcı adı girdiniz.");
                System.out.println("Sifrenizi giriniz:");
                parola = giris.nextLine();
                
                if (!parola.equalsIgnoreCase(sifre)) {
                    System.out.println("Yanlis sifre girdiniz.Tekrar deneyiniz.Kalan Hak=" + (3 - hak));
                } else {
                    System.out.println("Giriş başarılı");
                    break;
                }
            }
        }

    }

}
