import java.util.Scanner;
public class Quiz {
    // BMI ( beden kitle indeksi ) = agirlik/ (boy*boy)
    // agirlik: kg boy:m cinsinden olmalı
    // ağırlık ve boy bilgilerini klavyeden alır ve BMI hesaplar
    
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.println("Boy ve kilo degerlerini sirasiyla giriniz:");
        int boy = giris.nextInt();
        int kilo = giris.nextInt();
        System.out.println("Girilen boy degeri : "+boy+" , Girilen kilo değeri : " + kilo);       
        double boy_metre= boy/(100.0); 
        System.out.println(boy_metre);
    

        double index = kilo/(boy_metre*boy_metre);
        System.out.println("Beden kitle indeksi sonucu (BMI): "+ index+"tir.");




    }

}
