public class ornek19 {
    public static void main(String[] args) {
        int toplam=0;
        int sayac=0;
        int sayi=20;
        int sonSayi=71;
        int ilkSayi=20;
        int ElemanSayisi=(sonSayi-ilkSayi)/3+1;
        System.out.println("eleman sayısı="+ElemanSayisi);
        

        for(int i=0;i<18;i++){
            toplam+=sayi+(i*3);


        }
        System.out.println("Toplam="+toplam);
    }
}
