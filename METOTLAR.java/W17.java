import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Kullanıcıdan bir şifre alınız.
         * Aşağıdaki kontrolleri yapınız
         * Kullanıcıya tüm eksiklikleri yazdırınız
         * Eğer tüm şartlar sağlanırsa "Şifre başarıyla kaydedildi" yazdırınız
         * -İlk harf küçük harf olmalı
         * -Son harf rakam olmalı
         * -şifre boşluk içermemeli
         * -Uzunluğu en az 10 karakter olmalı
         */
        System.out.println("Şifrenizi giriniz : ");
        String sifre = scanner.nextLine();

        String bosluksuzHal = sifre.replace(" ", "");

        String ilkHarfKucukHal = sifre.substring(0, 1).toLowerCase();
        Boolean DogruMu = false;
        Boolean DogruMu2 = false;
        Boolean DogruMu3 = false;
        Boolean DogruMu4 = false;
        if (sifre.length() < 10) {
            System.out.println("Eksik tuslama yaptiniz. Tekrar deneyiniz.");
        } else {
            DogruMu = true;
        }
        if (!sifre.equals(bosluksuzHal)) {
            System.out.println("Şifre de bosluk var. Sifre bosluk icermemelidir.");
        } else {
            DogruMu2 = true;
        }
        if (!ilkHarfKucukHal.equals(sifre.substring(0, 1))) {
            System.out.println("İlk harf küçük olmalıdır!");
        } else {
            DogruMu3 = true;
        }
        int sonİndeks = sifre.length() - 1;
        System.out.println("son karakter = " + sifre.substring(sonİndeks));
        System.out.println("İndeks nosu : " + sonİndeks);
        char sonKarakter = sifre.charAt(sonİndeks);

        if (!Character.isDigit(sonKarakter)) {
            System.out.println("Son karakter rakam olmalıdır.");
        } else {
            DogruMu4 = true;
        }

        Boolean sonuc = DogruMu && DogruMu2 && DogruMu3 && DogruMu4;
        if (sonuc == true) {
            System.out.println("Basarili bir sekilde sifre olusturuldu.");
        }

    }
}
