import java.util.Scanner;

public class Quiz2 {
    //Dikdörtgenin alanını hesaplayan program
    public static void main(String[] args){
    System.out.print( "Dikdörtgenin kenarlarini sirasi ile giriniz:");
    Scanner giris=new Scanner(System.in);
    int x= giris.nextInt();
    int y=giris.nextInt();
    int A=x*y;
    System.out.println("Dikdörtgenin alani : "+ A+ " brdir. "); 
    }
}
