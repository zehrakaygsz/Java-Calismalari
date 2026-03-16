import java.util.Scanner;
public class K5 {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi ;

        sayi=giris.nextInt();
        System.out.println("Girdiginiz sayi ="+sayi);
        int kalan= sayi%7;
        if(kalan==0){
            System.out.println("Sayi yediye tam bölünmüstür.");
        }else{
            System.out.println("Sayi yediye tam bölünmez. Kalan ="+kalan);
        }
    }
    
}
