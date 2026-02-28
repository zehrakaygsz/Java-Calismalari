import java.util.Scanner;
public class Operatorler {
    public static void main(String[] args){
        boolean sonuc;
int x =5;
int y=5;
int z=7;
int w=3;

sonuc=((x==y) && (z<w));
System.out.println(sonuc);

//İF ELSE KONUSU


System.out.println("Yasinizi giriniz:");
Scanner giris= new Scanner(System.in);
int yas = giris.nextInt();

if(yas<18){
    System.out.println("Yetiskin degilsiniz.");
}else{
    System.out.println("Yetiskinsiniz.");
}
   /* KARNE NOTU UYGULAMASI
   ÖĞRENCİ NOTU:
   0-44: ZAYIF
   45-54: GEÇER
   55-64:ORTA
   65-74:İYİ
   75-84:ÇOK İYİ
   85-100:PEK İYİ */    


    System.out.print("Karne notunu giriniz: ");
    int karne_not= giris.nextInt();
    System.out.println("Karne notunuz : "+karne_not);
    if(karne_not>=0 && karne_not<=44){
        System.out.println("Maalesef karne notunuz:ZAYIF");
    }if(karne_not>=45 && karne_not<=54){
        System.out.println("Geçtiniz Tebrikler!");
    }if(karne_not>=55 && karne_not<=64){
        System.out.println("Orta seviyeyle geçtiniz. Tebrikler!");
        }
        if( karne_not>=65&&karne_not<=74){
            System.out.println("İyi ile geçtiniz.Tebrikler!");
        }if(karne_not>=75&& karne_not<=84){
            System.out.println("Çok iyi ile geçtiniz.Tebrikler!");
        }if(karne_not>=85&&karne_not<=100){
            System.out.println("Pek iyi ile geçtiniz.Tebrikler!");
        }
    }
}
