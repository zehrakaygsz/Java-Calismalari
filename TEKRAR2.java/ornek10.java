public class ornek10 {
    public static void main(String[] args) {
        /*
         * 2015 yılı itibarı ile ülke nüfusu 77 milyondur. Yıllık nüfus artış oranı %1.3
         * tür. Sonraki 10 yılda ülke nüfusunu yıllara
         * göre programın kodlarını yazınız,
         */
        Double anlikNüfus=77.0;
        Double artisOran=0.013;
        int yil=2025;

        for(int i=1;i<=10;i++){
            anlikNüfus+=anlikNüfus*artisOran;
            System.out.println(i+ " .yil Nüfusu = "+anlikNüfus);
        }

    }
}
