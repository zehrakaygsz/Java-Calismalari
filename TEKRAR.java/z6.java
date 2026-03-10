import java.util.Scanner;
public class z6 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        /*Hava sıcaklığını al
        Sıcaklık 30 veya üzeriyse yüzme etkinliği öner
        5 ve 30 arasında ise sinema öner
        4 ve daha az ise kayak öner  */

        System.out.println("Hava sicakliğini giriniz:");
        int sicaklik= input.nextInt();
        String etk;
        if(sicaklik>=30){
            System.out.println("Hava 30 derece ve üzeridir.");
        
            System.out.println("önerilen etkinliği giriniz :");
            input.nextLine();
            etk=input.nextLine();
            System.out.println("Tavsiye edilen etkinlik : "+etk+"dir.");
        }
        else if(sicaklik>5 && sicaklik<30){
            System.out.println("Hava 5 ile 30 derece arasindadir.");
            input.nextLine();
            etk=input.nextLine();
            System.out.println("Önerilen etkinlik : "+etk+"dir.");
        }else{
            System.out.println("Hava 4 dereceden daha azdir.");
            input.nextLine();
            System.out.println("önerilecek etkinliği giriniz:");
            etk=input.nextLine();
            System.out.println("Önerilen etkinlik : "+etk+"dir.");

        }



        }
    }

