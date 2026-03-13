import java.util.Scanner;
public class z10{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Sayi gir");
        int sayi=input.nextInt();

        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                System.out.println("sayi asal değil");
            }else{
                System.out.println("sayi asal");
            }
        }
    }
}