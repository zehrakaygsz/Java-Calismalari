import java.util.Arrays;

public class A4 {
    public static void main(String[] args) {
        String [] harfler ={"a","z","k","e"};
        Arrays.sort(harfler);
        System.out.print(Arrays.toString(harfler));
       // System.out.println(Arrays.binarySearch( harfler ,"e"));

        String [] harfler2 = {"a","e","z","k"};
        Arrays.sort(harfler2);
        System.out.println(Arrays.toString(harfler2));

        System.out.println(Arrays.equals(harfler , harfler2));


        String str = "Ali topu at , at Ali topu at " ;
        String [] arrVırgul = str.split(" , ");
        System.out.println(Arrays.toString(arrVırgul));

        


        String [] hiclik = str.split("");
        System.out.println(Arrays.toString(hiclik));
    }
    
}
