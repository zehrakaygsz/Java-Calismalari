import java.util.Random;
import java.util.Scanner;

public class PROJE2 {

    public static void main(String[] args) {
        /*
         * 3. Bir oyun tasarlanması istenmektedir. Oyunun kuralları aşağıdaki gibidir:
         * 1. Oyun başladığında 1-9 arasında rastgele bir sayı tutulacak, ekrana
         * yazdıracak ve bu sayı kullanıcının kasa değeri olacak,
         * 2. Sonra kullanıcıya “Kaç sefer daha sayı tutayım?” şeklinde bir soru
         * sorulacak,
         * 3. Kullanıcı bunun cevabını klavyeden girecek,
         * 4. Kullanıcının girdiği sefer/adet kadar bilgisayar 1-9 arasında rastgele
         * sayı tutacak, tuttuğu sayıları ekrana yazdıracak ve
         * her tuttuğu sayıyı kullanıcının kasa değerine ekleyecektir,
         * 5. Sayı tutma işlemi bitince kasa değeri ekrana yazdırılacak,
         * 6. Eğer kullanıcının kasa değeri 35-40 arasında ise “Tebrikler, kazandınız.”
         * mesajı yazdırılacak, bunların dışındaki
         * değerler için “Üzgünüm, kaybettiniz.” Mesajı yazdırılacaktır.
         */
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int kasaDeger = 0;
        int i = 0;
        System.out.println("kaç adet çalışsın?");
        int adet = giris.nextInt();

        do {
            int sayi = rnd.nextInt(9) + 1;
            System.out.println("sayi degeri=" + sayi);
            kasaDeger += sayi;
            i++;

        } while (i < adet);
        System.out.println("kasa degeri =" + kasaDeger);
        if (kasaDeger < 40 && kasaDeger > 35)
            System.out.println("başarıyla geçtiniz");
        else
            System.out.println("geçemediniz");
    }
}
