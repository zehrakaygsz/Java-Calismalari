import java.util.Scanner;

public class ornek8 {
    public static void main(String[] args) {
        /*
         * Çarpım tablosu programı yazınız. Klavyeden çarpan ve kaç adım olacağı bilgisi
         * girildikten sonra aşağıdaki gibi bir çıktı
         * veriniz:
         * Çarpan:5
         * Adım:6
         * 1x5=5
         * 2x5=10
         * 3x5=15
         * 4x5=20
         * 5x5=25
         * 6x5=30
         */
        Scanner giris = new Scanner(System.in);

        /*
         * System.out.println("Kac adıma kadar carpma islemi yapılsın?");
         * int adim = giris.nextInt();
         * System.out.println("Bir carpan giriniz:");
         * int carpan = giris.nextInt();
         * for (int i = 1; i <= adim; i++) {
         * 
         * int sonuc = carpan * i;
         * System.out.println(i + "*" + carpan + "=" + sonuc);
         * }
         */

        


        while (true) {
            System.out.println("Cikis icin 0 giriniz:");
            System.out.println("Carpani giriniz:");
            int carpan = giris.nextInt();
            if(carpan==0){
                System.out.println("cikis yapiliyor.");
                break;
            }else{
                System.out.println("adim sayisini giriniz");
                int adim = giris.nextInt();
                for(int i=1;i<=adim;i++){
                    System.out.println(i+"x"+carpan+"="+(i*carpan));
                }

            }

        }

    }
}
