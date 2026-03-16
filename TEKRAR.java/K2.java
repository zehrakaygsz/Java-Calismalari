import java.util.Scanner;
public class K2 {
    public static void main(String[] args){
        //KLAVYEDEN GİRİLEN BİR SAYININ POZİTİF ,NEGATİF VEYA SIFIRA EŞİT 
        //OLDUĞUNU EKRANA YAZDIRAN PROGRAM
        Scanner giris= new Scanner(System.in);
        System.out.println("Sayi giriniz.");
        int sayi= giris.nextInt();
        if(sayi>0){
            System.out.println("Sayi pozitiftir.");
        }
        else if(sayi<0){
            System.out.println(" Sayi sifirdan kücüktür.");
        }
        else{
            System.out.println("Sayi sifira eşittir.");
        }

    }
}
