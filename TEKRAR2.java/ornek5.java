
public class ornek5 {
    public static void main(String[] args) {
        int a = 5, b = 100, c;
        c = ++a;
        b += ++c + a * 2;
        System.out.println(b);
        int d1 = 59;
        char d2 = 'A';
        int d3 = (d1 + d2) / 10;
        System.out.println(d3);

        int k = 5;
        int l = 3;
        String m = "T";
        System.out.println(k + l);
        System.out.println("" + 8 + 2 + " ");
        System.out.println(k + l + m);
        System.out.println("" + k + l + " ");
        System.out.println(m + (k + l) + " ");
    }

}