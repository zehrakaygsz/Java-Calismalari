import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        //ürün tutarı ,kdv oranı,gerçek fiyatı gerekli
        Scanner input= new Scanner(System.in);
        System.out.println("Ürünün fiyatini giriniz:");
        int fiyat =input.nextInt();
        System.out.println("Ürünün KDV oranini giriniz: ");
        double KDV=input.nextDouble();
        double fyt2= fiyat+(fiyat*KDV);
        System.out.println("Ürünün satis fiyati = " +fyt2);

    }
    
}
