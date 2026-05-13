import java.util.Scanner;

public class Depo {
    static Scanner scanner = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {
        String tercih;

        do {
            System.out.println("\n\n\n\t\t\t=====YILDIZLARARASI KOLEJİ=====\n" +
                    "\t\t\t===== ANA MENU =====\n" + "\n" +
                    "\t 1-Okul Bilgileri Goruntule\t\t\t\n \t 2-Ogretmen Menu\n" +
                    "\t 3-Ogrenci Menu\t\t \n" + "\t Q-ÇIKIŞ\n");
            System.out.println("Lütfen tercihinizi giriniz : ");
            tercih = scanner.nextLine();
            switch (tercih) {
                case "1": // Okul bilgileri
                    Depo.OkulBilgileriniYazdir();
                    break;

                case "2":// Ogretmen menusu
                    Ogretmen.OgretmenMenu();
                    break;

                case "3": // Ogrenci menu

                    break;

                case "q":
                case "Q":
                    break;

                default:
                    System.out.println("Geçerli tercih giriniz : ");
                    break;

            }

        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void projeDurdur() {
        System.out.println("Okul projesinden çıkış seçildi.Çıkış yapılıyor...\n");
    }

    public static void OkulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\n\n\n\t\t\t=====YILDIZLARARASI KOLEJİ=====\n" +
                "\t Adres : "+Okul.adres+
                "\n\t\t"+"Telefon  :"+Okul.telNO);
                Thread.sleep(500);
    }



}