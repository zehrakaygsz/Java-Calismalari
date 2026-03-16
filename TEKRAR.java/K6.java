import java.util.Scanner;
public class K6 {
    public static void main(String[] args){
        Scanner giris= new Scanner(System.in);
        System.out.println("İki direnç degeri giriniz:");
        double direnc1,direnc2;
        double sonuc;
        direnc1= giris.nextDouble();
        direnc2=giris.nextDouble();

        System.out.println("Baglanti tipini giriniz. s-seri / p-paralel");
        char secim= giris.next().charAt(0);
        switch(secim){
            case 's':
                sonuc=direnc1+direnc2;
                System.out.println("Devre seri bagli olup direnc degeri ="+sonuc);
                break;
            case 'p':
                sonuc= (1/direnc1)+(1/direnc2);
                System.out.println("Devre paralel bagli olup direnc degeri ="+sonuc);
                break;
            default:
                System.out.println("Yanlis tusladiniz. Tekrar deneyiniz.");
                break;

        }


    }
    
}
