import java.util.Scanner;
public class W4 {
    public static int topla(Scanner giris){
        System.out.println("İki sayi giriniz : ");
        int x = giris.nextInt();
        int y= giris.nextInt();
        int toplam = x+y;
        System.out.println("Sonuç : "+ toplam);
        return toplam;
    }

    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        topla(giris);
        /*
         * çalıştığında kendisine yollanan iki adet tam sayıyı toplayıp sonucunu ekrana
         * yazan metot
         */
    }
}

