import java.util.Locale;
import java.util.Scanner;

public class W15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" İsim giriniz: ");
        String isim = scanner.nextLine();
        

        System.out.println("Soy ad giriniz : ");
        String Soyad = scanner.nextLine();
        String yeniAd;
        String yeniSoyAd;
        


        System.out.println("16 Haneli kredi kartı numaranızı giriniz: ");
        String kartNo = scanner.nextLine();
        
        if(kartNo.length()!=16){
            System.out.println("Eksik ya da fazla tusladınız.Tekrar deneyiniz:");
        }else{
            yeniAd = isim.substring(0,1).toUpperCase(Locale.forLanguageTag("Tr"))+
            isim.substring(1).replaceAll("\\w","*");
            yeniSoyAd= Soyad.substring(0,1).toUpperCase(Locale.forLanguageTag("Tr"))+
            Soyad.substring(1).replaceAll(".","*");  
            System.out.println(yeniAd+" "+yeniSoyAd);


        String yeniKartNo = kartNo.substring(0,11).replaceAll("\\d","*").concat(kartNo.substring(12));
        

        System.out.println("Kart numaranız : "+ yeniKartNo);
        }
    }

}
