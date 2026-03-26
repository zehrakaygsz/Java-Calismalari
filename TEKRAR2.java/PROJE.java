import java.util.Scanner;
import java.util.Random;

public class PROJE {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int kutudakiParalar[] = { 42, 10, -5, 23, -45, 40, 16, -9, 15, 32, -10 - 2, 48, 30, 41, -3, 24, 18, 20, -1 };
        
        int toplam = 0;

        String secim;
        int adet = 1;
        do {
        int indeks = rnd.nextInt(20);
        int para = kutudakiParalar[indeks];
            if (para > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
            toplam += para;
            System.out.println("Devam mi tamam mi?(D/T)");
            secim = giris.nextLine();
            if (secim.equals("D")) {
                System.out.println("kullanılan hak ="+adet);
                adet++;
                continue;
            } else {
                System.out.println("Tamam secildi . Cikis yapiliyor.");
                break;
            }

        } while (adet <= 10);

    }

}
