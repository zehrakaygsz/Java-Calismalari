public class W6 {
        public static void topla(int ... sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println("toplam = " + toplam);
    }

    public static void main(String[] args) {
        topla(44,47);
        topla(1,2,3,4,5,6,7,8,9,10);
        /*
         * Metoda kaç tane sayı yollarsak
         * yollayalım bütün sayıları toplamı
         * bulup ekrana yazdırsın.
         */

    }
}

