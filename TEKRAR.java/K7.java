import java.util.Scanner;
public class K7 {
    /*. Bir eğitim kurumunda görev yapan öğretmenlere normal maaşlarına ek olarak, girdikleri ders 
saatine göre ek ders ücreti ödenmektedir. Ödenecek ek ders ücreti aşağıdaki şartlara göre 
verilmektedir.
a. Ders saati 10 saatten az ise ders saati başına 10 TL,
b. Ders saati 10 ile 20 saat arasında ise ders saati başına 12,5TL,
c. Ders saati 20 saatten fazla ise ders saati başına 13 TL,
Buna göre öğretmenin girilen ek ders saatine göre alacağı ücreti bulan program, */
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
    
        System.out.println("Ek ders saatini giriniz :");
        int ek_ders=giris.nextInt();

        if(ek_ders<10){
        System.out.println("Kazanilan ek ücret =" +ek_ders*10+"TLdir.");
        }else if(ek_ders>=10 && ek_ders<20){
            System.out.println("Kazanilan ek ücret =" +ek_ders*12.5+"TLdir.");
        }else{
            System.out.println("Kazanilan ek ücret ="+ek_ders*13+"TLdir.");
        }

    }
    
}
