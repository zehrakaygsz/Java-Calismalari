public class M1 {
    public static void main(String[] args) {
        AsalMi(79);
        
    }

    public static void AsalMi(int sayi) {
        int bolen = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                bolen++;
            } else {
                continue;
            }
        }
        if (bolen == 2) {
            System.out.println("Sayi asaldir.");
        } else {
            System.out.println("Asal degildir.");
        }
    }

}
