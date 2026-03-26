import java.util.Scanner;
public class z13 {
    public static void main(String[] args){
        int[] liste = new int[4];
        int[] liste2={1,2,3,4};
        for(int i=0;i<4;i++){
            System.out.println((i+1) +". eleman ="+liste2[i]);
        }
        int[] liste3= new int[4];
        Scanner giris=new Scanner(System.in);

        for(int i=0;i<liste3.length;i++){
            System.out.println((i+1)+ ". elemani giriniz:");
            liste3[i]=giris.nextInt();
            System.out.println((i+1)+".eleman = "+liste3[i]);
        }

    }

}