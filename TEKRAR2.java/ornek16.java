import java.util.Scanner;

public class ornek16 {
    public static void main(String[] args) {
        /*
         * Kullanıcı evet , hayır ve bitir yazana kadar sorsun
         * Kullanıcı kaç kere evet yazdı
         * kaç kere hayır yazdı bul
         */
        Scanner giris = new Scanner(System.in);
        String secim;
        int eToplam = 0;
        int hToplam = 0;
        String e = "evet";
        String h = "hayır";
        String b = "bitir";
        do {
            System.out.println("secim giriniz(evet/hayır/bitir");
            secim=giris.nextLine();
            if(secim.equals("e")){
                eToplam++;
                System.out.println("evet toplamı="+eToplam);
            }else if(secim.equals("h")){
                hToplam++;
                System.out.println("Hayır toplamı ="+hToplam);
            }else{
                System.out.println("Bitir secildi.Programdan cikiliyor.");
                break;
                
            }
            
        } while (secim.equals("e")||secim.equals("h"));
    

        
    }}
    
