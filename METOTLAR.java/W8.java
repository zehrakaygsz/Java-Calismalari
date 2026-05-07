import java.util.Scanner;
public class W8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki kere şifrenizi giriniz : ");
        String metin1= scanner.nextLine();
        String metin2= scanner.nextLine();

        if(metin1.equals(metin2)){
            System.out.println("Şifreler eşleşti . ");
        }
        else if(metin1.equalsIgnoreCase(metin2)){
            System.out.println("Yazımları kontrol ediniz.  ");
        }
        else{
            System.out.println("Şifreler uyuşmuyor .");
        }


    }
}