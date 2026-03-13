import java.util.Scanner;
public class z11 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        int sayi=input.nextInt();
        int toplam=0;
        int adet=0;
        while(sayi>0){
            if(sayi>10){
                toplam+=sayi;
                adet++;
            }
        }
        System.out.println("Toplam = "+toplam);
        System.out.println("adet = "+adet);

    
    


    }
}
    

