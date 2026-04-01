import java.util.Scanner;

public class ornek20 {
    public static void main(String[] args) {
        /*
         * Meteoroloji merkezi için bir program tasarlanması istenilmiştir. Programın
         * çalışma şekli ise şöyle olmalıdır:
         * a.
         * İlk önce hangi ay için sıcaklık bilgisi girileceği kullanıcıya
         * sorulacaktır.(Kullanıcının Ocak, Şubat, Mart, Nisan,
         * Mayıs, Haziran, Temmuz, Ağustos, Eylül, Ekim, Kasım ve Aralık bilgisinden
         * birisini girdiğini varsayınız.)
         * b.
         * Girilen ay bilgisine uygun olarak o ayda kaç tane gün var ise kullanıcıdan
         * gün sayısı kadar sıcaklık bilgisi girilmesi
         * istenilecektir(Şubat ayı için gün sayısını 28 alınız, diğer ayların gün
         * sayısını 30 alınız).
         * c.
         * Sıcaklık veri girişi bittikten sonra o ayın sıcaklık ortalaması bilgisi
         * ekrana yazdırılacaktır. Bu işlemden sonra
         * program sonlanacaktır.
         * Örnek Çıktı: Şubat Ayına ait Ortalama Sıcaklık=15,6 derecedir.
         */
        Scanner giris = new Scanner(System.in);
        int sıcaklık;
        int toplam = 0;
        int Ay_gün_Sayisi = 30;
        int secim;
        int Subat_AY_gün = 28;
        do {
            System.out.println("Hangi ay üzerinde çalışılsın? 1-12 arasında secim yapınız.");
            secim = giris.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Ocak ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("Ocak ayı ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 2:
                    System.out.println("Şubat ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Subat_AY_gün));
                    break;
                case 3:
                    System.out.println("Mart ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 4:
                    System.out.println("Nisan ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 5:
                    System.out.println("Mayıs ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 6:
                    System.out.println("Mayıs ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 7:
                    System.out.println("Haziran ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 8:
                    System.out.println("Temmuz ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 9:
                    System.out.println("Eylül ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 10:
                    System.out.println("Ekim ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 11:
                    System.out.println("Kasım ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;
                case 12:
                    System.out.println("Aralık ayı seçildi.");
                    for (int i = 1; i <= Ay_gün_Sayisi; i++) {
                        System.out.println(i + ".Günün sicakliğini giriniz:");
                        sıcaklık = giris.nextInt();
                        toplam += sıcaklık;
                    }
                    System.out.println("ay ortalaması " + (toplam / Ay_gün_Sayisi));
                    break;

            }

        } while (secim <= 12 && secim >= 1);
    }
}