import java.util.Scanner;
import java.util.Random;

public class ornek21 {
    public static void main(String[] args) {
        /*
         * Toplama işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun
         * başladığı zaman rastgele 2 tane 1-100
         * arasında sayı tutulacak, tutulan sayılar ekrana gösterilecek ve kullanıcıya
         * bu sayıların toplamı nedir diye sorulacaktır.
         * Eğer kullanıcı doğru cevap verirse “Tebrikler Bildiniz” değil ise “Üzgünüm
         * Bilemediniz” diye mesaj verecektir. Her
         * cevaptan sonra “Tekrar Oynamak istiyormusunuz(e/E)?” şeklinde bir soru
         * sorulacak ve eğer kullanıcı “e” veya “E”
         * ile karşılık verirse oyun tekrar başlayacaktır. Kullanıcının puanı her doğru
         * cevap için 5 puan artacak, her yanlış cevap
         * için ise 2 puan azalacaktır. Oyun sonlandığında kullanıcının verdiği doğru
         * cevap sayısı, yanlış cevap sayısı ve puanı
         * ekranda listelenmelidir. Bu işlemleri yapan programın kodlarını yazınız.
         */
        Random rnd = new Random();
        Scanner giris = new Scanner(System.in);
        int toplam = 0;
        int puan = 0;
        int dSayac = 0, ySayac = 0;
        String secim;
        do {
            int pcSayi = rnd.nextInt(100) + 1;
            int pcSayi2 = rnd.nextInt(100) + 1;
            System.out.println("PC sayi 1=" + pcSayi);
            System.out.println("PC sayi 2=" + pcSayi2);
            int aToplam = pcSayi + pcSayi2;
            System.out.println("Bu sayilarin toplami nedir?giriniz");
            int kToplam = giris.nextInt();
            if (kToplam == aToplam) {
                System.out.println("Tebrikler! bildiniz.");
                puan += 5;
                System.out.println("Mevccut puan ="+puan);
                dSayac++;
            } else {
                System.out.println("üzgünüm bilemediniz.");
                puan -= 2;
                ySayac++;
                System.out.println("Mevcut puan ="+puan);
            }
            System.out.println("Tekrar oynamak istiyor musunuz?(e/E=evet)");
            giris.nextLine();
            secim = giris.nextLine();
        }while(secim.equals("e") || secim.equals("E"));
        System.out.println("Dogru sayisi" + dSayac);
        System.out.println("yanlis sayisi= " + ySayac);
    }
}
