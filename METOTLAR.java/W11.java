import java.util.Scanner;
public class W11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String metin = scanner.nextLine();

        int sonuc=metin.indexOf('a');
        if(sonuc==0){
            System.out.println("Metinde hiç a yok.Tekrar deneyiniz!");
        }else{
            System.out.println("İlk a yeri = "+sonuc);
            int sonuc2=metin.indexOf('a',sonuc+1);
            System.out.println("İkinci a yeri"+sonuc2);
        }
        
    }
}
