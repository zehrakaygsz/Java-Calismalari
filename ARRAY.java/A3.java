import java.util.Arrays;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        int sonuc[]= diziOlustur();
        System.out.println(Arrays.toString(sonuc));

    int []sayilar;
    }

    public static int[] diziOlustur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz:");
        int boyut = scanner.nextInt();

        int []sayilar = new int[boyut];
        System.out.println("Elemanları giriniz: ");
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = scanner.nextInt();
        }

        return sayilar;
    }

}
