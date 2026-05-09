import java.security.InvalidKeyException;
import java.util.Scanner;

public class W20 {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan ismini alın
         * Kullanıcı 3 isimli de olsa
         * isimlerin ilk harfi büyük
         * kalanlar * şeklinde yazdırılsın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        String isim = scanner.nextLine();

        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinciSpaceIndex = isim.indexOf(" ", ilkSpaceIndex + 1);

        int kelimeSayisi = 0;
        if (ilkSpaceIndex == -1) {
            kelimeSayisi = 1;
        } else if (ikinciSpaceIndex == -1) {
            kelimeSayisi = 2;
        } else {
            kelimeSayisi = 3;
        }

        switch (kelimeSayisi) {
            case 1:
                System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*"));
                break;

            case 2:
                System.out.println(isim.substring(0, 1).toUpperCase()
                        + isim.substring(1, ilkSpaceIndex).replaceAll("\\w", "*") + " " +
                        isim.substring(ilkSpaceIndex+1,ilkSpaceIndex+2).toUpperCase()
                        + isim.substring(ilkSpaceIndex + 2).replaceAll("\\w", "*"));
                break;
        }
    }

}
