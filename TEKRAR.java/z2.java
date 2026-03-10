import java.util.Scanner;
public class z2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        double sayi1,sayi2;
        double sonuc;
        
        System.out.println("ilk sayiyi giriniz: ");
        sayi1=input.nextDouble();
        System.out.println("Sayi ikiyi giriniz");
        sayi2=input.nextDouble();
        System.out.println("Yapmak istediginiz islemi seciniz : (+ , - , / , * )");
        char islem = input.next().charAt(0);
        System.out.println("Secilen islem = "+islem);

        switch(islem){
            case '+':
                sonuc=sayi1+sayi2;
                    System.out.println("Sonuc = "+sonuc );
                break;
            case '-':
                sonuc=sayi1-sayi2;
                    System.out.println("Sonuc = "+sonuc );
                break;
            case '*':
                sonuc=sayi1*sayi2;
                System.out.println("Sonuc = "+sonuc );
                break;
            case '/':
                sonuc=sayi1/sayi2;
                    System.out.println("Sonuc = "+sonuc );
                break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz. Tekrar deneyiniz.");
        
        }


    }}

