import java.util.Scanner;

public class W14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin = scanner.nextLine();

        metin=metin.replaceAll("\\d","");
        metin = metin.replaceAll(" ","2");
        System.out.println("Metin:" +metin);
        metin=metin.replaceAll("\\W",""); //Spacei de sildi
        System.out.println("Metnin yeni hali : "+metin);//Korunan space yerinden sayıyı kaldırabiliriz
        metin=metin.replaceAll("2"," ");
        metin=metin.replaceAll("_","");
        System.out.println("Metnin güncel hali : "+metin);
    }

}
