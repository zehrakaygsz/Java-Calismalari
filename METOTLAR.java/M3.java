import java.util.Scanner;
public class M3 {
    public static void main(String[] args) {

    System.out.println(İsimBirlestir("zehra" ,"selin"));
        /*Verilen isim ve soy ismi alıp 
        İsim ve Soy ismin ilk harfleri büyük , diğer harfler küçük olacak şekilde
        düzenleyip , isim boşluk soyisim şeklinde bize döndüren metot oluşturunuz.
        input :  isim : Ali , soyisim : YILMAZ
        method return : Ali Yilmaz */
    }
    public static String İsimBirlestir(String isim ,String soyİsim){
        String yeni = isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+soyİsim.substring(0,1).toUpperCase()+soyİsim.substring(1).toLowerCase();
        return yeni;

        

    }
}
