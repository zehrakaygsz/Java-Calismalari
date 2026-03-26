
public class ornek3 {
    public static void main(String[] args) {
        int sayi1 = 0, sayi2 = 0;
        int i = 4;
        do {
            sayi1 = i % 3;
            sayi2 = i % (i - i - 5 + 10);
            if (sayi2 == 0 || sayi1 == 0)
                System.out.println(i);
            i++;
        } while (i <= 10);

    }
}
