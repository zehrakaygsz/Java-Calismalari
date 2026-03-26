import java.util.Scanner;
import java.util.Random;

public class ornek6 {
    public static void main(String[] args){
        Scanner giris=new Scanner(System.in);
        Random rnd=new Random();
        int kullanicipuan=0,pcpuan=0,sayac=0;
        do {
            sayac++;
            System.out.println(sayac+". mac oynanıyor.");
            System.out.println("1-6 arası sayı giriniz:");
            int sayi=giris.nextInt();
            kullanicipuan+=sayi;
            int pcsayi=rnd.nextInt(6)+1;
            pcpuan+=pcsayi;
            
            System.out.println("Kullanıcı puan degeri ="+kullanicipuan);
            System.out.println("Bilgisiyar puan değeri ="+pcpuan);

            if(pcpuan!=kullanicipuan){
                if(pcpuan<kullanicipuan){
                    kullanicipuan++;
                    System.out.println("Kullanici puanı daha yüksek.Yeni kullanıcı deger ="+kullanicipuan);

                }else{
                    pcpuan++;
                    System.out.println("Pc puanı daha yüksek.Yeni PC deger ="+pcpuan);
                }
            }else{
                System.out.println("Puanlar eşit tekrar 3 tur oynanacaktır.");
                sayac=0;
                continue;
            }
            
        } while (sayac<3);
        System.out.println("PC puanı ="+pcpuan);
        System.out.println("Kullanıcı puanı ="+kullanicipuan);

    }
    
}
