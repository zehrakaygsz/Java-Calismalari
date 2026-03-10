import java.util.Scanner;

public class z5 {
    /*
     * 1000 Autp-generated method stub
     * Km birim fiyatı : 0.10$
     * 12 yaşından küçüklere toplam fiyat üzerinden %50 indirim
     * 12 ve 24 yaş arasındaysa %10 indirim
     * 65 yaşından büyükse %30 indirim
     * gidiş dönüş alrsa %20 indirim
     * Bu koşullara göre uçak biletini hesaplayan program
     */
    public static void main(String[] args) {
        double toplam = 0;
        double yeni_fyt,km;
        Scanner input = new Scanner(System.in);
        System.out.println("Yolculuk tipini seciniz : ( 1-Tek gidis , 2-Gidis/Donus)");
        char secim = input.next().charAt(0);

        
        switch (secim) {
            case '1':
                System.out.print("Gidilen km bilgisini giriniz:");
                km = input.nextInt();
                toplam = km * 0.10;
                System.out.println("İndirimsiz fiyat : " + toplam + "$");
                System.out.println("Müsterinin yasini giriniz :");
                int yas = input.nextInt();
                System.out.print("Müsterinin yasi : " + yas);
                if (yas < 12) {
                    yeni_fyt = (toplam - (toplam * 0.5));
                    System.out.print("ödenecek tutar : " + yeni_fyt + "$");
                } else if (yas >= 12 && yas <= 24) {
                    yeni_fyt = toplam - (toplam * 0.1);
                    System.out.print("ödenecek tutar :" + yeni_fyt + "$");
                } else if (yas > 65) {
                    yeni_fyt = (toplam - (toplam * 0.3));
                    System.out.print("ödenecek tutar : " + yeni_fyt + "$");}
                    break;


                
            case '2':
                System.out.println("Gidilen km bilgisini giriniz:");
                km=input.nextInt();
                toplam=2*km*(0.10);
                System.out.println("Musterinin yasini giriniz: ");
                yas=input.nextInt();
                if(yas<12){
                    yeni_fyt=toplam-(toplam*0.5);
                    System.out.println("ödenecek tutar : "+yeni_fyt+"$");
                }
                else if(yas>=12 && yas<=24){
                    yeni_fyt=toplam-(toplam*0.1);
                    System.out.println("ödenecek tutar : "+yeni_fyt+"$");               
                }else if(yas>65){
                    yeni_fyt=toplam-(toplam*0.3);
                    System.out.println("Ödenecek tutar : "+ yeni_fyt+"$");
                    
                }
                
                break;

                

        }

    }
}