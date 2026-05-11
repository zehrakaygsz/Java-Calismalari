import java.util.Arrays;

public class A6 {
    public static void main(String[] args) {
        String[] isimler = { "Ali","Hasan"};
        String []Newİsimler = new String[isimler.length+1];

        Newİsimler[0]=isimler[0];
        Newİsimler[1]=isimler[1];
        Newİsimler[2]="Can";

        isimler=Newİsimler;

        System.out.println(Arrays.toString(isimler));


        
    }
}
