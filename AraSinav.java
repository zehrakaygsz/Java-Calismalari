import java.util.Scanner;

public class AraSinav {
    /*
     * BMI = AGİRLİK / (BOY*BOY)
     * BMI<18.5 İSE ZAYIF
     * 18.5<=BMI <=25 İSE NORMAL
     * 25< BMI <30 İSE KİLOLU
     * BMI >=30 İSE OBEZ SINIFINDADIR
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz:");
        int boy = scanner.nextInt();
        System.out.print("Kilonuzu giriniz:");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " + kilo);
        double boy_metre = boy / (100.0);
        double BMI = kilo / (boy_metre * boy_metre);
        System.out.println("Beden Kitle İndeksiniz: " + BMI);

        if (BMI < 18.5) {
            System.out.println("ZAYIF");}
            if (BMI >= 18.5 && BMI <= 25) {
                System.out.println("NORMAL");}
                if (BMI > 25 && BMI < 30) {
                    System.out.println("KİLOLU");}
                    if (BMI >= 30) {
                        System.out.println("OBEZ");
                    }
                }
            }
        
    


