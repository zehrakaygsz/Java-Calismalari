import java.util.Arrays;

public class A7 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 2 };
        // Verilen int bir arraye istenen bir elemanı ekleyip
        // son halini döndüren metot oluşturunuz
        int []yeniDizi = arrayElemanEkle(arr, 7, 9 , 15);
        System.out.println(Arrays.toString(yeniDizi));
    }

    public static int[] arrayElemanEkle(int[] arr, int a  , int b, int c) {

        int[] yeniArr = new int[arr.length + 3];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
            
        }
        yeniArr[yeniArr.length-3]=a;
        yeniArr[yeniArr.length-2]=b;
        yeniArr[yeniArr.length-1]=c;
        

        return yeniArr;
    }
}
