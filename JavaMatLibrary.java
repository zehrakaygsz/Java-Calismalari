import java.util.Scanner;
public class JavaMatLibrary {
    public static void main(String[] args){
        System.out.println("Karenin kenarini giriniz: ");
        Scanner giris = new Scanner(System.in);
    
        int kenar= giris.nextInt();
    

        System.out.println("karenin kenar degeri : "+ kenar );
        double alan = Math.pow(kenar,2);
        System.out.println("Karenin alani:"+alan);

        System.out.println(Math.abs(-99)); //Mutlak değerini verir
        
    







    }}