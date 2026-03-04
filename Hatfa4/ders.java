import java.util.Scanner;
public class ders{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Oğrencinin notunu giriniz");
        int not= scanner.nextInt();
        if(not>0 && not<25){
            System.out.println("F");
        }
        if(not>=25 && not<45)
            System.out.println("E");
        if(not>=45 && not<=55)
            System.out.println("D");
        if(not>=55 && not<70)
            System.out.println("C");
        if(not>=70 && not<85)
            System.out.println("B");
        if(not>=85 && not<=100)
            System.out.println("A");
        
}

}