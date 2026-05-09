import java.util.Scanner;
public class W19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        /*Kullanıcıdan string alınız. 
        Stringin uzunluğu çift sayı ise tam ortasına :) ekleyiniz
        tek ise ortadaki harfi siliniz :( yazınız .  */
        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        int uzunluk=metin.length();
        int kalan = 0 ; 

        if(uzunluk%2==0){
            int indeks= uzunluk/2;
            System.out.println("Uzunluk çifttir.");
            String yeniMetin = metin.substring(0,indeks)+":)"+metin.substring(indeks);
            System.out.println("Yeni metin hali  :" + yeniMetin);
        }else{
            System.out.println("Uzunluk tektir. ");
            int indeks = uzunluk/2;
            metin=metin.substring(0,indeks)+metin.substring(indeks+1);
            String yeniMetin=metin.substring(0,indeks)+":("+metin.substring(indeks);
            System.out.println("Yeni metin : "+yeniMetin);
        }
    }
}
