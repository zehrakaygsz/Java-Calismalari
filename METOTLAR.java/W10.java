import java.util.Scanner;
public class W10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mail adresinizi giriniz: ");
        String mail = scanner.nextLine();

        if(!mail.contains("@")){
            System.out.println("Geçersiz mail ");
        }
        else if(!mail.contains("@gmail.com")){
            System.out.println("Mail Gmail olmalıdır.");
        }
        else if(!mail.endsWith("@gmail.com")){
            System.out.println("Mailde yazım hatası var");
        }
        else {
            System.out.println("Doğru mail girilmiştir.");
        }
    }
}
