import java.util.Scanner;
public class z3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String k_adi,parola;
        System.out.print("Kullanici adini giriniz: ");
        k_adi=input.nextLine();
        System.out.print("Sifrenizi giriniz: ");
        parola=input.nextLine();

        if(k_adi.equals("java")&& parola.equals("123")){
        System.out.println("Basarili sekilde giris yaptiniz.");
        }else{
            System.out.println("Giris yapamadiniz.");
        }
    }
    
}
