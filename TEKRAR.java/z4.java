import java.util.Scanner;
public class z4 {
    public static void main(String[] args){
    double t_rkce,mat,fen,sosyal,beden;
    Scanner giris=new Scanner(System.in);
    double toplam=0;
    System.out.println("Turkce notlarini giriniz:");
    t_rkce=giris.nextDouble();
    System.out.println("Matematik notlarini giriniz:");
    mat=giris.nextDouble();
    System.out.println("Fen notunu giriniz:");
    fen=giris.nextDouble();
    System.out.println("Sosyal Bilimler notunu giriniz:");
    sosyal=giris.nextDouble();
    System.out.println("Beden egitimi notlarini giriniz");
    beden=giris.nextDouble();
    toplam=t_rkce+mat+fen+sosyal+beden;
    double ortalama=toplam/5;
    System.out.println("Ogrencinin ortalamasi = "+ortalama);



    }
}
