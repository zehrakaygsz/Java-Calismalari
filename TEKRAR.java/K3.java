import java.lang.Math;
import java.util.Scanner;

public class K3 {
    // KLAVYEDEN GİRİLEN BİRBİRİNE EŞİT OLMADIĞI DÜŞÜNÜLEN İKİ SAYIDAN BÜYÜĞÜNÜ
    // EKRANA YAZDIRAN PROGRAM
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println(" İki Sayi giriniz");
        int sayi = giris.nextInt();
        int sayi2= giris.nextInt();

        System.out.println("Büyük Sayi="+ Math.max(sayi,sayi2));
    }
}