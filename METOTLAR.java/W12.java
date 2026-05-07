import java.util.Scanner;

public class W12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cümle = scanner.nextLine();
        System.out.println("Aranacak metni giriniz:");
        String metin = scanner.nextLine();

        System.out.println(cümle.contains(metin));
        Boolean sonuc = cümle.contains(metin);
        if(sonuc.equals(false)){
            System.out.println("Cümle , metni içermiyor. ");

        }else{
            System.out.println("Cümle metni içermektedir. ");
            System.out.println("İlk indeks kısmı "+cümle.indexOf(metin));
            int indeks1=cümle.indexOf(metin);
            System.out.println("Son indeks kısmı "+cümle.lastIndexOf(metin));
            int indeks2= cümle.lastIndexOf(metin);
            if(indeks1==indeks2){
                System.out.println("Cümle aranan metni 1 defa içermektedir.");
            }else{
                System.out.println("Birden çok kez içermektedir.");
            }

        }

    }
}
