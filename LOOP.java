import java.util.Scanner;

public class LOOP {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci sayinizi giriniz:");
        int öğrsayi = scanner.nextInt();
        System.out.print(" Öğrencilerin Notlarini giriniz : ");
    
        for (int k = 1; k <= öğrsayi; k++) {
            int not = scanner.nextInt();
            System.out.println(+k + ". Öğrenci notu = " + not);
            toplam += not;

        }
        double ortalama = toplam / öğrsayi;
        System.out.println("Sinif ortalamaiz =" + ortalama + "dir.");

    }

}
