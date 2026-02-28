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

        System.out.println("********* WHİLE DÖNGÜSÜ *********");

        //WHİLE DÖNGÜSÜ
        System.out.println("10dan 1e kadar yazdir while döngüsü ile");
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }
        
    }

}
