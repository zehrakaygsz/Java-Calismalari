import java.util.Arrays;

public class A1 {
    public static void main(String[] args) {
        int array[] = { 3, 7, 0, 2, 4, 6 };
        int[] dizi2 = degerArtir(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] degerArtir(int[] dizi) {
        int sayi = 5;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] += sayi;
        }
        return dizi;

    }
}