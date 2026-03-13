import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class K1 {
    // DİZİDEKİ ELEMANLARIN ORTALAMASI
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int toplam=0;
        System.out.println("dizinin boyutunu giriniz :");
        int boyut = giris.nextInt();
        int dizi[] = new int[boyut];
        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = giris.nextInt();
            toplam+=dizi[i];
        }
        System.out.println("toplam = "+toplam);
        System.out.println("Dizinin ortalamasi ="+(toplam/boyut));

    }

}
