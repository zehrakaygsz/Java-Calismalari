
public class ornek13 {
    public static void main(String[] args){
        /*1den 100e kadar olan sayıların toplamını yazdır */
        /*int toplam=0;
        int cifttoplam=0;
        for(int i=1;i<=100;i++){
            toplam+=i;
            if(i%2==0){
                cifttoplam+=i;
            }
        }
        System.out.println("1-100 e kadar olan toplam ="+toplam);
        System.out.println("cift toplam="+cifttoplam);
        System.out.println("Tek toplam="+(toplam-cifttoplam));
        */
    int toplam=0;
    int i=1;
    while(i<=100){
        toplam+=i;
        i++;
    }
    System.out.println("toplam = "+toplam);
    }
    
}
