import java.math.*;
import java.util.Scanner;
public class z1 {
    //Dairenin alanı ,ve çevresini hesaplama
    // alan  pi rkare , çevre ise iki pi kare 
    //ihtiyaç = yarıçap ve mat kütüphanesi
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Yaricaplari giriniz :");
        int yaricap;
        double alan;
        double cevre;
        double pi=3.14;
        yaricap=input.nextInt();
        alan=pi*(yaricap*yaricap);
        cevre=2*pi*yaricap;
        System.out.println("Alan="+alan+" , "+"Cevre =" +","+cevre);
        System.out.println("cap" +  Math.pow(yaricap,2));
    }


}
