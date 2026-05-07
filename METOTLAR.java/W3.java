import java.util.Random;
public class W3 {
    public static int degerDondur(Random rnd){
        int sayi = rnd.nextInt(101);
        return sayi;

    }
    public static void main(String[] args) {
        Random rnd= new Random();
        int sonuc=degerDondur(rnd);
        System.out.println(sonuc);
        /*
         * Çalıştığında 0-100 arası bir tam sayı tutup geriye tuttuğu değeri döndüren
         * metot
         */
    }
}

