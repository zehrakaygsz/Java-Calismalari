import java.util.Scanner;

public class W9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz  : ");
        String metin = scanner.nextLine();
        String metin2 = metin.toLowerCase();
        if (metin2.contains("ev")) {
            System.out.println("Ev gibisi yok!");
        } else if (metin2.contains("java")) {
            System.out.println("java çalışmak ne güzel!");
        } else {
            System.out.println("Bir uğraşla uğraşmak lazım");
        }
    }
}
