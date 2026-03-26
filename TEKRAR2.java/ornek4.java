
public class ornek4 {
    public static void main(String[] args) {
        int a = 2, b = 2, c = 2, d = 2;
        do {
            a++;
            System.out.println("a="+a);
            if (a < 4)
                b++;
            System.out.println("b="+b);
            for (c = 1; c <= b; c++){
                System.out.println("c="+c);
                
                d++;
            System.out.println("d="+d);}
            System.out.println("c="+c+"d="+d);
        } while (a <= 4);
        System.out.println(a + " " + b + " " + c);
    }
}
