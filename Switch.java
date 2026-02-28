import java.util.Scanner;
public class Switch {
    /*SWİTCH(değişkeni) */
    public static void main(String[] args){
        /*1-7 KADAR OLAN GÜNLER UYGULAMASI (KULLANICI KONSOLDAN SAYI OLARAK GİRSİN 
        PROGRAM BU SAYIYI GÜNE ÇEVİRSİN) */
        Scanner gün= new Scanner(System.in);
    

        System.out.print("Merak ettiğiniz 1-7 arasindaki sayiyi giriniz:");
        int giris=gün.nextInt();

        switch(giris){
            case 1:
                System.out.println(" = Pazartesi gününü seçtiniz.");
                break;
            case 2:
                System.out.println("Sali gününü seçtiniz.");
                break;
            case 3:
                System.out.println("Çarşamba gününü seçtiniz.");
                break;
            case 4:
                System.out.println("Perşembe gününü seçtiniz.");
                break;
            case 5:
                System.out.println("Cuma gününü seçtiniz.");
                break;
            case 6:
                System.out.println("Cumartesi gününü seçtiniz.");
                break;
            case 7:
                System.out.println("Pazar gününü seçtiniz.");
                break;
        
            

            
            
            }



    }
}
