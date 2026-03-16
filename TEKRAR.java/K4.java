import java.util.Scanner;
public class K4 {
    //KLAVYEDEN GİRİLEN BİR SAYİNİN ÇİFT Mİ POZİTİF Mİ OLDUĞUNU BULAN PROGRAM
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        int sayi;
        sayi= giris.nextInt();
        
        if(sayi%2==0){
            System.out.println("Sayi cifttir.");
            
        }else{
            System.out.println("Sayi tektir.");
        }
    }
}
