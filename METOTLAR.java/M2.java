public class M2 {
    public static void main(String[] args) {
        /*Metni tersten yazdıran bir metot oluşturun */
        TerstenYazdir("zehra");
    }
    public static void TerstenYazdir(String metin){
        for(int i=metin.length()-1;i>=0;i--){
            System.out.print(metin.charAt(i));
        }
    }
}
