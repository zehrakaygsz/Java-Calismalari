import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        //Cümledeki en uzun kelimeyi ve en kısa kelimeyi yazdırın
        String str = "Java gun gectikce daha da guzellesiyor";

        String []kelimeler = str.split(" ");
        Arrays.sort(kelimeler);
        System.out.println("Kelimeler dizisi"+Arrays.toString(kelimeler));

        //karşılaştırmak için kelime boyutlarına ihtiyacım var.
        int min = kelimeler[0].length();
        int max=kelimeler[0].length();
        int boyut[] = new int[kelimeler.length];
        int maxİndeks = 0 ; int minİndeks = 0;
        for(int i=0;i<kelimeler.length;i++){
            boyut[i]=kelimeler[i].length();
            if(boyut[i]>max){
                max = boyut[i];
                maxİndeks = i;
            }else if(boyut[i]<min){
                min=boyut[i];
                minİndeks=i;
        }}
        System.out.println("En uzun kelime : "+kelimeler[maxİndeks]);
        System.out.println("En kısa kelime : "+kelimeler[minİndeks]);

    
    } }
