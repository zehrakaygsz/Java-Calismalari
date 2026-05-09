import java.util.Scanner;

public class W18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scanner.nextLine();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);

        System.out.println("Soy adınızı giriniz:");
        String SoyAd = scanner.nextLine();
        SoyAd = SoyAd.substring(0, 1).toUpperCase() + SoyAd.substring(1);

        int isimBoyut = isim.length();
        int SoyAdBoyut = SoyAd.length();

        if (isimBoyut > SoyAdBoyut) {
            System.out.print("İsim - Soy İsim : " + isim+ "  ");
            System.out.print(SoyAd);
        } else {
            SoyAd = SoyAd.substring(0).toUpperCase();
            System.out.print("İsim - Soy İsim : " + isim+"  ");
            System.out.print( SoyAd);
        }

    }
}
