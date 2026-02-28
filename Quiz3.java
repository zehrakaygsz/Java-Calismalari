import java.util.Scanner;

public class Quiz3 {
    public static void main(String[] args) {
        /*
         * WHİLE DÖNGÜSÜ KULLANARAK KULLANICININ GİRDİĞİ SAYININ FAKTÖRİYELİNİ
         * HESAPLAYAN PROGRAM
         */
        Scanner giris = new Scanner(System.in);
        System.out.println("Faktöriyeli hesaplanacak sayiyi giriniz:");
        int k = giris.nextInt();
        int carpim = 1;
        while (k >= 1) {
            carpim *= k;
            k--;

        }
        System.out.println("Faktöriyeli = " + carpim + " dir.");

    


    System.out.println("********** DO WHİLE DÖNGÜSÜ ************");
    //KULLANICI SAYI GİRSİN. SEÇİLEN SAYIYA KADAR OLAN TÜM SAYILARIN TOPLAMINI HESAPLASIN
    System.out.println("Sayi giriniz:");
    int sayi=giris.nextInt();
    System.out.println("Girilen sayi = " + sayi );
    int toplam=0;
    int i=0;
    do{
        i++;
        toplam+=i;
    }while(i<=sayi);

    System.out.println("Girilen sayiya kadar olan toplam =" +(toplam-i) );

    System.out.println("****************** QUİZ *******************");
    // KULLANICININ GİRDİĞİ BİR SAYININ RAKAM DEĞERLERİNİN TOPLAMINI BULAN PROGRAM
    //ÖRNEK 254=> 2+5+4=11 
    System.out.println("Sayi giriniz:");
    int sayi2=giris.nextInt();
    System.out.println("Sayi = " +sayi2);

    int toplam2=0;
    // 254 % 10 = 4  
    do{
        toplam2 += ( sayi2 % 10 ) ;
        sayi2 = sayi2 /10; // 254/10= 25 olur sayi2
    }while( sayi2>0 );
        System.out.println("toplam =" + toplam2);


    }


}
