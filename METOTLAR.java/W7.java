import java.util.Arrays;
import java.util.Random;
public class W7 {
    /*
     * 50 elemanlı bir diziye 0-100 arasında
     * rastgele sayılar atanacaktır.
     * DiziyiSirala adında bir metot a dizi
     * parametre olarak yollanacaktır. Metot
     * diziyi küçükten büyüğe doğru
     * sıralayarak ekrana yazdıracaktır
     */
    public static void randomSayiAta(Random rnd , int[] dizi) {
        for ( int i = 0; i<dizi.length;i++){
            dizi[i] = rnd.nextInt(101);
        }
        }
    

    public static void DiziyiSirala(int []kopya){
        Arrays.sort(kopya);
        System.out.println(Arrays.toString(kopya));

    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] dizi = new int[50];

        randomSayiAta(rnd,dizi);
        DiziyiSirala(dizi);
    }
}


